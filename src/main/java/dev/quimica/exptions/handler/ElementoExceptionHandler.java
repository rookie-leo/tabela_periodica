package dev.quimica.exptions.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ElementoExceptionHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        return mapExceptionToResponse(e);
    }

    private Response mapExceptionToResponse(Exception ex) {
        if (ex instanceof ElementoDuplicadoException) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage());

        return null;// TODO - implementar um retorno generico
    }

}
