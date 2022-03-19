package com.devinhouse.devagro.services;

import com.devinhouse.devagro.models.Empresa;
import com.devinhouse.devagro.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> findAll () {
        return repository.findAll();
    }

    public Empresa findById(Long id) {
        Optional <Empresa> emp = repository.findById(id);
        return emp.get();
    }

    public Empresa cadastraEmpresa(Empresa emp) {
        return repository.save(emp);
    }

}
