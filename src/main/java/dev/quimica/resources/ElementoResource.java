package dev.quimica.resources;

import dev.quimica.resources.model.ElementoDTO;
import dev.quimica.services.ElementoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/elementos")
@Produces(MediaType.APPLICATION_JSON)
public class ElementoResource {

    @Inject
    ElementoService service;

    @GET
    public Set<ElementoDTO> listAll() {
        return service.listAll();
    }

    @POST
    public Set<ElementoDTO> createElemento(ElementoDTO request) {
        return service.createElemento(request);
    }
}