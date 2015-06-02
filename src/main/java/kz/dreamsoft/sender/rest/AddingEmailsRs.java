package kz.dreamsoft.sender.rest;

import kz.dreamsoft.sender.domain.dto.AddEmailDTO;
import kz.dreamsoft.sender.service.AddEmailsService;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by olzhas on 5/27/15.
 */
@Path("adding-emails")
@Consumes("application/json")
public class AddingEmailsRs {

    @Inject
    AddEmailsService addEmailsService;

    @POST
    @Path("add")
    public void add(AddEmailDTO addEmailDTO) throws MessagingException{
        addEmailsService.add(addEmailDTO.getEmails());
    }
}
