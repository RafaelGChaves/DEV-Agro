package com.devinhouse.devagro.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "fazenda")
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;

    @NotNull
    private Double estoqueGrao;

    @Column(name = "ultima_colheita")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate ultimaColheita;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "grao_id")
    private Grao grao;

    public Fazenda(){

    }

    public Fazenda(Long id, String nome, String endereco, Double estoqueGrao, LocalDate ultimaColheita, Empresa empresa, Grao grao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.estoqueGrao = estoqueGrao;
        this.ultimaColheita = ultimaColheita;
        this.empresa = empresa;
        this.grao = grao;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getEstoqueGrao() {
        return estoqueGrao;
    }

    public void setEstoqueGrao(Double estoqueGrao) {
        this.estoqueGrao = estoqueGrao;
    }

    public LocalDate getUltimaColheita() {
        return ultimaColheita;
    }

    public void setUltimaColheita(LocalDate ultimaColheita) {
        this.ultimaColheita = ultimaColheita;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Grao getGrao() {
        return grao;
    }

    public void setGrao(Grao grao) {
        this.grao = grao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fazenda fazenda = (Fazenda) o;

        return id != null ? id.equals(fazenda.id) : fazenda.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
