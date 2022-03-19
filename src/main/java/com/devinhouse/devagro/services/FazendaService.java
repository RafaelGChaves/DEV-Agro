package com.devinhouse.devagro.services;

import com.devinhouse.devagro.models.Fazenda;
import com.devinhouse.devagro.repositories.FazendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FazendaService {

    @Autowired
    private FazendaRepository repository;

    @Autowired
    private EmpresaService empresaService;

    public List<Fazenda> findAll () {
        return repository.findAll();
    }

    public Fazenda findById(Long id) {
        Optional <Fazenda>  faz = repository.findById(id);
        return faz.get();
    }

    public List<Fazenda> getFazendaByEmpresaId(Long id) {
        return  repository.findByEmpresaId(id);
    }

    public Long numeroFazendasEmpresa (Long id) {
        List<Fazenda> listaFazendas = repository.findByEmpresaId(id);
        return listaFazendas.stream().count();
    }

    public Fazenda cadastroFazenda(Fazenda faz){
        return repository.save(faz);
    }

    public void deleta(Long id) {
        repository.deleteById(id);
    }

    public Fazenda acrescentaEstoque(Long id, Fazenda estoque) {
        Fazenda faz = repository.findById(id).get();
        faz.setEstoqueGrao(estoque.getEstoqueGrao() + faz.getEstoqueGrao());
        faz.setUltimaColheita(LocalDate.now());
        return repository.save(faz);
    }

    public Fazenda decrementaEstoque(Long id, Fazenda estoque) {
        Fazenda faz = repository.findById(id).get();
        faz.setEstoqueGrao(faz.getEstoqueGrao() - estoque.getEstoqueGrao());
        return repository.save(faz);
    }

}
