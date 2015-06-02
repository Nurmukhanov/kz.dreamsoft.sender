package kz.dreamsoft.sender.rest;

import kz.dreamsoft.sender.domain.dto.RequestToRegisterDTO;
import kz.dreamsoft.sender.exception.RequestAlreadyCreated;
import kz.dreamsoft.sender.exception.RequestNotExists;
import kz.dreamsoft.sender.service.RegistrationService;

import javax.ejb.EJB;
import javax.mail.MessagingException;
import javax.ws.rs.*;

/**
 * Created by olzhas on 5/23/15.
 */

@Path("register")
@Consumes("application/json")
public class RegistrationRs {

    @EJB
    RegistrationService registrationService;

    @POST
    @Path("request")
    public String register(RequestToRegisterDTO registerDTO) throws RequestAlreadyCreated, MessagingException {
        return registrationService.register(registerDTO.getEmail(), registerDTO.getPwd(), registerDTO.getName());
    }

    @GET
    @Path("confirm/{id}")
    public String confirm(@PathParam("id") String id) throws RequestNotExists {
        return registrationService.confirm(id);
    }
}