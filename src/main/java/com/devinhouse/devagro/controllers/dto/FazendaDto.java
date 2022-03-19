package com.devinhouse.devagro.controllers.dto;

import com.devinhouse.devagro.models.Fazenda;
import com.devinhouse.devagro.models.Grao;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class FazendaDto {

    private Long id;
    private String nome;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate ultimaColheita;

    Grao grao;

    private FazendaDto() {
    }

    public FazendaDto(Fazenda faz){
        this.id = faz.getId();
        this.nome = faz.getNome();
        this.ultimaColheita = faz.getUltimaColheita();
        this.grao = faz.getGrao();
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

    public LocalDate getUltimaColheita() {
        return ultimaColheita.plusDays(grao.getTempoColheita());
    }

    public void setUltimaColheita(LocalDate ultimaColheita) {
        this.ultimaColheita = ultimaColheita;
    }

}
