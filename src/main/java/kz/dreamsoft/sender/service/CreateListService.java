package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.domain.Email;
import kz.dreamsoft.sender.repo.EmailRepo;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by olzhas on 5/27/15.
 */
@Stateless
public class CreateListService{

    @Inject
    EmailRepo emailRepo;

    public void createList(List<Long> ids) {
        Email email = new Email();

        for (Long id : ids) {
            email.setEmail(emailRepo.find(id).getEmail());
        }
    }
}
