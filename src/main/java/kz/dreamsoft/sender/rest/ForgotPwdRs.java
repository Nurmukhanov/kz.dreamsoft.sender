package kz.dreamsoft.sender.rest;

import kz.dreamsoft.sender.domain.dto.RequestToRestorPwdDTO;
import kz.dreamsoft.sender.exception.EmailNotFound;
import kz.dreamsoft.sender.service.ForgotPwdServce;

import javax.ejb.EJB;
import javax.mail.MessagingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by olzhas on 5/26/15.
 */
@Path("/forgotpwd")
@Consumes("application/json")
public class ForgotPwdRs {
    @EJB
    ForgotPwdServce forgotPwdServce;

    @POST
    @Path("request")
    public String request(RequestToRestorPwdDTO requestToRestorPwd) throws EmailNotFound, MessagingException {
        return forgotPwdServce.confirmPwd(requestToRestorPwd.getEmail());
    }
}
