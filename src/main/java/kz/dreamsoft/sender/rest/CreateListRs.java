package kz.dreamsoft.sender.rest;

import kz.dreamsoft.sender.service.CreateListService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by olzhas on 5/27/15.
 */
@Path("list")
@Consumes("application/json")
public class CreateListRs {

    @Inject
    CreateListService createListService;


    @Path("create/{ids}")
    public void createList(@PathParam("ids")List<Long> ids){
        createListService.createList(ids);
    }
}
