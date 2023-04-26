package dev.quimica.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Elemento extends PanacheEntity {

    private Integer numeroAtomico;
    private String nome;
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
