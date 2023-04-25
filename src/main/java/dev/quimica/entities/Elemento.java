package dev.quimica.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Elemento extends PanacheEntity {

    private Integer numeroAtomico;
    private String field;
    private String simbolo;
    private Double massaAtomica;

    public Integer getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(Integer numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getMassaAtomica() {
        return massaAtomica;
    }

    public void setMassaAtomica(Double massaAtomica) {
        this.massaAtomica = massaAtomica;
    }
}
