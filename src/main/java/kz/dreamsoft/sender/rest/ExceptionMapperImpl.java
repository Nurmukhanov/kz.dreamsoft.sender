package kz.dreamsoft.sender.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by olzhas on 5/23/15.
 */
@Provider
public class ExceptionMapperImpl implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception e) {
        return Response.status(500).entity(e.getMessage()).build();
    }
}
