package com.devinhouse.devagro.models;

import javax.persistence.*;

@Entity
@Table(name = "grao")
public class Grao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer tempoColheita;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Grao(){
    }

    public Grao(Long id, String nome, Integer tempoColheita, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.tempoColheita = tempoColheita;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempoColheita() {
        return tempoColheita;
    }

    public void setTempoColheita(Integer tempoColheita) {
        this.tempoColheita = tempoColheita;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grao grao = (Grao) o;

        return id != null ? id.equals(grao.id) : grao.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
