package dev.quimica.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
public class Elemento extends PanacheEntity {

    @Column(unique = true)
    private Integer numeroAtomico;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private String simbolo;

    private String massaAtomica;

    public Elemento() {
    }

    public Elemento(Integer numeroAtomico, String nome, String simbolo, String massaAtomica) {
        this.numeroAtomico = numeroAtomico;
        this.nome = nome;
        this.simbolo = simbolo;
        this.massaAtomica = massaAtomica;
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
