package dev.quimica.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Elemento extends PanacheEntity {

    @Column(unique = true, nullable = false)
    private Integer numeroAtomico;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String simbolo;

    @Column(nullable = false)
    private String massaAtomica;

    public Elemento() {
    }

    public Elemento(Integer numeroAtomico, String nome, String simbolo, String massaAtomica) {
        this.numeroAtomico = numeroAtomico;
        this.nome = nome;
        this.simbolo = simbolo;
        this.massaAtomica = massaAtomica;
    }

    public static Elemento findByNumeroAtomico(Integer numeroAtomico) {
        try {
            List<Elemento> elementoList = Elemento.list("numeroAtomico", numeroAtomico);
            return elementoList.get(0);
        } catch (RuntimeException ex) {
            ex.getMessage();
        }
        return null; //TODO - implementar um retorno
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
