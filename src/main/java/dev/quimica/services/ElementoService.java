package dev.quimica.services;

import dev.quimica.entities.Elemento;
import dev.quimica.resources.model.ElementoDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.HashSet;
import java.util.Objects;
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

    public ElementoDTO findByNumeroAtomico(Integer numeroAtomico) {
        return new ElementoDTO(Objects.requireNonNull(Elemento.findByNumeroAtomico(numeroAtomico)));
    }

    @Transactional
    public void deleteByNumeroAtomico(Integer numeroAtomica) {
        Elemento elemento = Elemento.findByNumeroAtomico(numeroAtomica);
        if (elemento.isPersistent()) {
            elemento.delete();
        } else {
            throw new NotFoundException("Elemento não encontrado!");
        }

    }

}
