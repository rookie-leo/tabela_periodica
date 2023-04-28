package dev.quimica.resources.model;

import dev.quimica.entities.Elemento;
import io.smallrye.common.constraint.NotNull;

import javax.validation.constraints.NotBlank;

public class ElementoDTO {

    @NotNull()
    public Integer numeroAtomico;

    @NotBlank(message = "Campo obrigatório!")
    public String nome;

    @NotBlank(message = "Campo obrigatório!")
    public String simbolo;

    @NotBlank(message = "Campo obrigatório!")
    public String massaAtomica;

    /**
     * @deprecated uso exclusivo do Hibernate
     * */
    @Deprecated
    ElementoDTO() {}

    public ElementoDTO(Elemento elemento) {
        numeroAtomico = elemento.getNumeroAtomico();
        nome = elemento.getNome();
        simbolo = elemento.getSimbolo();
        massaAtomica = elemento.getMassaAtomica();
    }

    public Elemento toModel() {
        return new Elemento(numeroAtomico, nome, simbolo, massaAtomica);
    }
}
