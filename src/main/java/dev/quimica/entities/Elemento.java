package dev.quimica.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Elemento extends PanacheEntity {

    private Integer numeroAtomico;
    private String nome;
    private String simbolo;
    private String massaAtomica;

    public Integer getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(Integer numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getMassaAtomica() {
        return massaAtomica;
    }

    public void setMassaAtomica(String massaAtomica) {
        this.massaAtomica = massaAtomica;
    }
}
