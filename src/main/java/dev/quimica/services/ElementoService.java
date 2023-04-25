package dev.quimica.services;

import dev.quimica.entities.Elemento;
import dev.quimica.resources.model.ElementoResponse;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class ElementoService {

    public Set<ElementoResponse> listAll() {
        Set<ElementoResponse> elementoResponses = new HashSet<>();

        Elemento.listAll()
                .forEach(elemento -> {
                    elementoResponses.add(new ElementoResponse((Elemento) elemento));
                });

        return elementoResponses;
    }

}
