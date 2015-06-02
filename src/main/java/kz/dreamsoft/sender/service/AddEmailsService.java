package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.domain.Email;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by olzhas on 5/27/15.
 */
@Stateless
public class AddEmailsService {

    public void add(List<String> emails){
        Email email = new Email();

        for (String email1 : emails){
            email.setEmail(email1);
        }
    }
}
