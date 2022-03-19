package com.devinhouse.devagro.controllers.dto;

import com.devinhouse.devagro.models.Fazenda;
import com.devinhouse.devagro.models.Grao;

public class FazendaEstoqueDto {

    private Double estoqueGrao;

    private Grao grao;

    private FazendaEstoqueDto(){
    }

    public FazendaEstoqueDto(Fazenda faz) {
        this.grao = faz.getGrao();
        this.estoqueGrao = faz.getEstoqueGrao();
    }

    public String getEstoqueGrao() {
        return estoqueGrao.toString() + " Kg";
    }

    public void setEstoqueGrao(Double estoqueGrao) {
        this.estoqueGrao = estoqueGrao;
    }

    public String getGrao() {
        return grao.getNome();
    }

    public void setGrao(Grao grao) {
        this.grao = grao;
    }
}
