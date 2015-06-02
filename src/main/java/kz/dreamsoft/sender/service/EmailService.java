package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.domain.*;
import kz.dreamsoft.sender.repo.EmailListRepo;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.List;

/**
 * Created by olzhas on 5/23/15.
 */
@Stateless
public class EmailService {

    @Resource(name = "mail")
    Session session;

    @Inject
    EmailListRepo emailListRepo;

    @Inject
    EmailMessage emailMessage;
    
    public void sendConfirmation(RequestToRegister requestToRegister) throws MessagingException {
        MimeMessage m = new MimeMessage(session);
        m.setContent("http://localhost:8080/register/confirm/"+requestToRegister.getUrl(), "text/html");
        try {
            m.setRecipients(Message.RecipientType.TO, requestToRegister.getEmail());
            Transport.send(m);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void sendPwd(SUser sUser) throws MessagingException{
        MimeMessage m = new MimeMessage(session);
        m.setContent("This is your password" + sUser.getPwd(), "text/html");
        try {
            m.setRecipients(Message.RecipientType.TO, sUser.getUserName());
            Transport.send(m);
        } catch (MessagingException e){
            e.printStackTrace();
        }
    }

    public void sendEmaiFromQueue() throws MessagingException {
        MimeMessage m = new MimeMessage(session);
        m.setContent(emailMessage.getMsg(), "text/html");

        List<EmailList> emails = emailListRepo.findAllEmail();

        for(EmailList email: emails ){
            try{
                m.setRecipients(Message.RecipientType.TO, email.getEmail());
            }
            catch (MessagingException e){
                e.printStackTrace();
            }
        }
    }
}
