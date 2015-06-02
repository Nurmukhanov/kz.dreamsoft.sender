package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.domain.SUser;
import kz.dreamsoft.sender.repo.UserRepo;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.mail.MessagingException;

/**
 * Created by olzhas on 5/26/15.
 */
public class ForgotPwdServce {

    @EJB
    UserRepo userRepo;

    @Inject
    EmailService emailService;

    public String confirmPwd(String email) throws MessagingException {

        SUser sUser =  userRepo.findeByEmail(email);
        emailService.sendPwd(sUser);
        return "We will sent your password to" + sUser.getUserName();
    }
}
