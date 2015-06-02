package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.domain.RequestToRegister;
import kz.dreamsoft.sender.domain.SUser;
import kz.dreamsoft.sender.exception.RequestAlreadyCreated;
import kz.dreamsoft.sender.exception.RequestNotExists;
import kz.dreamsoft.sender.repo.RequestToRegisterRepo;
import kz.dreamsoft.sender.repo.UserRepo;
import kz.dreamsoft.sender.utils.TokenUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.mail.MessagingException;

/**
 * Created by olzhas on 5/23/15.
 */
@Stateless
public class RegistrationService {

    @EJB
    RequestToRegisterRepo requestToRegisterRepo;

    @Inject
    EmailService emailService;

    @EJB
    UserRepo userRepo;

    public String register(String email, String pwd, String name) throws RequestAlreadyCreated, MessagingException {

        RequestToRegister requestToRegister = requestToRegisterRepo.findOptionalByEmail(email);
        if (requestToRegister != null) throw new RequestAlreadyCreated();

        requestToRegister = new RequestToRegister();
        requestToRegister.setEmail(email);
        requestToRegister.setPwd(pwd);
        requestToRegister.setName(name);
        requestToRegister.setUrl(TokenUtils.generateActiovationUrl());

        requestToRegisterRepo.persist(requestToRegister);

        emailService.sendConfirmation(requestToRegister);

        return "Chek email " + requestToRegister.getEmail();
    }

    public String confirm(String id) throws RequestNotExists {
        RequestToRegister requestToRegister = requestToRegisterRepo.findOptionalByUrl(id);
        if (requestToRegister == null) throw new RequestNotExists();

        SUser user = new SUser();
        user.setUserName(requestToRegister.getEmail());
        user.setPwd(requestToRegister.getPwd());
        user.setName(requestToRegister.getName());
        user.getRoles().add("user");

        requestToRegisterRepo.remove(requestToRegister);

        userRepo.persist(user);

        return "Ok";
    }
}
