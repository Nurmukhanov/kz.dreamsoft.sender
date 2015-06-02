package kz.dreamsoft.sender.repo;

import kz.dreamsoft.sender.domain.EmailList;
import kz.taimax.tomee.generics.repository.impl.GenericGRepository;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by olzhas on 5/27/15.
 */
@Stateless
public class EmailListRepo extends GenericGRepository<EmailList, Long>{
    public List<EmailList> findAllEmail() {

        List<EmailList> resultList = typedQuery("select i.email from EmailList i").getResultList();

        return resultList;
    }
}
