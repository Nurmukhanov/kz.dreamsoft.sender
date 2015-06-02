package kz.dreamsoft.sender.rest;

import kz.dreamsoft.sender.service.EmailService;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;

/**
 * Created by olzhas on 5/27/15.
 */
@Path("emailqueue")
@Consumes("application/json")
public class SendEmailFromEmailListRs {

    @Inject
    EmailService emailService;

    @Path("send")
    public void sendEmailformEmaillist() throws MessagingException {
        emailService.sendEmaiFromQueue();
    }
}
