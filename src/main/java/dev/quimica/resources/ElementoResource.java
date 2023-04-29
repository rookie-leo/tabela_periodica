package dev.quimica.resources;

import dev.quimica.resources.model.ElementoDTO;
import dev.quimica.services.ElementoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    public Response createElemento(ElementoDTO request) {
        return Response.ok(service.createElemento(request)).build();
    }

    @GET
    @Path("/{numeroAtomico}")
    public Response findByNumeroAtomico(@PathParam("numeroAtomico") Integer numeroAtomico) {
        return Response.ok(service.findByNumeroAtomico(numeroAtomico)).build();
    }

    @DELETE()
    @Path("/{numeroAtomico}")
    public Response deleteElemento(@PathParam("numeroAtomico") Integer numeroAtomica) {
        service.deleteByNumeroAtomico(numeroAtomica);
        return Response.status(200).build();
    }
}