package dev.quimica.resources;

import dev.quimica.resources.model.ElementoResponse;
import dev.quimica.services.ElementoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/elementos")
public class ElementoResource {

    @Inject
    ElementoService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<ElementoResponse> listAll() {
        return service.listAll();
    }
}