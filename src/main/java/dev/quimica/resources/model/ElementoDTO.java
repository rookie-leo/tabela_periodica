package dev.quimica.resources.model;

import dev.quimica.entities.Elemento;

public class ElementoDTO {

    public Integer numeroAtomico;
    public String nome;
    public String simbolo;
    public String massaAtomica;

    public ElementoDTO() {}

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
