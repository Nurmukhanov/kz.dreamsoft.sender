import kz.dreamsoft.sender.domain.dto.RequestToRegisterDTO;
import org.apache.cxf.jaxrs.client.ServerWebApplicationException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.MediaType;
import java.net.URISyntaxException;
import java.net.URL;

@RunWith(Arquillian.class)
public class RegisterTest extends Assert {

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addPackages(true, "kz.dreamsoft.sender")
                .addAsManifestResource("persistence.xml", "persistence.xml")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @ArquillianResource
    private URL webappUrl;

    @Test
    public void requestShouldBeAccepted() throws URISyntaxException {
        String response = WebClient.create(webappUrl.toURI())
                .type(MediaType.APPLICATION_JSON)
                .path("register/request").post(new RequestToRegisterDTO("olzhas.nurmukhanov@gmail.com", "olzhas", "jim"), String.class);

        assertEquals(response, "Chek email olzhas.nurmukhanov@gmail.com");
    }

    @Test(expected = ServerWebApplicationException.class)
    public void requestShouldNotBeAccepted() throws URISyntaxException {
        String response = WebClient.create(webappUrl.toURI())
                .type(MediaType.APPLICATION_JSON)
                .path("register/request").post(new RequestToRegisterDTO("olzhas.nurmukhanov@gmail.com", "olzhas", "jim"), String.class);

        String response2 = WebClient.create(webappUrl.toURI())
                .type(MediaType.APPLICATION_JSON)
                .path("register/request").post(new RequestToRegisterDTO("olzhas.nurmukhanov@gmail.com", "olzhas", "jim"), String.class);

        assertEquals(response2, "Email exists");
    }
}

