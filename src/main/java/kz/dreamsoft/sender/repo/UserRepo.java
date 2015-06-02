package kz.dreamsoft.sender.repo;

import kz.dreamsoft.sender.domain.SUser;
import kz.taimax.tomee.generics.repository.impl.GenericGRepository;

import javax.ejb.Stateless;
import java.util.List;


/**
 * Created by olzhas on 5/12/15.
 */

@Stateless
public class UserRepo extends GenericGRepository<SUser, Long> {

    public SUser findByUsername(String username) {
        List<SUser> resultList = typedQuery("select i from SUser i where i.userName = '" + username + "'").getResultList();
        if (resultList.size() == 0) return null;

        return resultList.get(0);
    }

    public SUser findeByEmail(String email) {
        List<SUser> resultList = typedQuery("select i from SUser i where i.userName = '" + email + "'").getResultList();
        if (resultList.size()==0) return null;

        return resultList.get(0);
    }
}
