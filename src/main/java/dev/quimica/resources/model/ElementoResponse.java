package dev.quimica.resources.model;

import dev.quimica.entities.Elemento;

public class ElementoResponse {

    public Integer numeroAtomico;
    public String nome;
    public String simbolo;
    public String massaAtomica;

    public ElementoResponse(Elemento elemento) {
        numeroAtomico = elemento.getNumeroAtomico();
        nome = elemento.getNome();
        simbolo = elemento.getSimbolo();
        massaAtomica = elemento.getMassaAtomica();
    }

    public Integer getNumeroAtomico() {
        return numeroAtomico;
    }

    public String getNome() {
        return nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getMassaAtomica() {
        return massaAtomica;
    }
}
