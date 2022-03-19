package com.devinhouse.devagro.services;

import com.devinhouse.devagro.models.Funcionario;
import com.devinhouse.devagro.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll () {
        return repository.findAll();
    }

    public Funcionario findById(Long id) {
        Optional <Funcionario> func = repository.findById(id);
        return func.get();
    }

    public List<Funcionario> getFuncionarioByEmpresaId (Long id) {
        return repository.findByEmpresaId(id);
    }

    public Long numeroFuncionariosEmpresa (Long id){
        List<Funcionario> func = repository.findByEmpresaId(id);
        return func.stream().count();
    }

    public Funcionario cadastraFuncionarios (Funcionario func) {
        return repository.save(func);
    }
}
