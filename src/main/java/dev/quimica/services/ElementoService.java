package dev.quimica.services;

import dev.quimica.entities.Elemento;
import dev.quimica.resources.model.ElementoDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class ElementoService {

    public Set<ElementoDTO> listAll() {
        Set<ElementoDTO> elementoResponses = new HashSet<>();

        Elemento.listAll()
                .forEach(elemento -> {
                    elementoResponses.add(new ElementoDTO((Elemento) elemento));
                });

        return elementoResponses;
    }

    @Transactional
    public ElementoDTO createElemento(ElementoDTO request) {
        Elemento elemento = request.toModel();
        elemento.persist();

        return request;
    }
}
