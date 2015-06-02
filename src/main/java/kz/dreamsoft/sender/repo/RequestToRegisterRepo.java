package kz.dreamsoft.sender.repo;

import kz.dreamsoft.sender.domain.RequestToRegister;
import kz.taimax.tomee.generics.repository.impl.GenericGRepository;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by olzhas on 5/23/15.
 */
@Stateless
public class RequestToRegisterRepo extends GenericGRepository<RequestToRegister, Long> {
    public RequestToRegister findOptionalByEmail(String email) {
        List<RequestToRegister> resultList = typedQuery("select i from RequestToRegister i where i.email = '" + email + "'").getResultList();
        if (resultList.size() == 0) return null;

        return resultList.get(0);
    }

    public RequestToRegister findOptionalByUrl(String url) {
        List<RequestToRegister> resultList = typedQuery("select i from RequestToRegister i where i.url = '" + url + "'").getResultList();
        if (resultList.size() == 0) return null;

        return resultList.get(0);
    }
}
