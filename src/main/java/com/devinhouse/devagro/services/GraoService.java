package com.devinhouse.devagro.services;

import com.devinhouse.devagro.models.Grao;
import com.devinhouse.devagro.repositories.GraoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GraoService {

    @Autowired
    private GraoRepository repository;

    public List<Grao> findAll () {
        return repository.findAll();
    }

    public Grao findById(Long id) {
        Optional <Grao> gr = repository.findById(id);
        return gr.get();
    }

    public List<Grao> getGraoByEmpresaId (Long id) {
        return repository.findByEmpresaId(id);
    }

    public Grao cadastraGraos (Grao gr) {
        return repository.save(gr);
    }
}
