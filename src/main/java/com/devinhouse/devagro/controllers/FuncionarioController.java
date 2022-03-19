package com.devinhouse.devagro.controllers;

import com.devinhouse.devagro.models.Funcionario;
import com.devinhouse.devagro.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity <List<Funcionario>> findAll () {
        List<Funcionario> listaFuncionario = service.findAll();
        return ResponseEntity.ok().body(listaFuncionario);
    }


    @GetMapping("/{id}")
        ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        Funcionario func = service.findById(id);
        return ResponseEntity.ok().body(func);
    }

    @GetMapping("/empresa/{id}")
        public ResponseEntity<List<Funcionario>> getFuncionariosByEmpresaId (@PathVariable Long id) {
        List<Funcionario> listaFuncionarios = service.getFuncionarioByEmpresaId(id);
        return ResponseEntity.ok().body(listaFuncionarios);
    }

    @GetMapping("/empresa/quantidade/{id}")
    public Long numeroFuncionariosEmpresa (@PathVariable Long id) {
        return service.numeroFuncionariosEmpresa(id);
    }

    @PostMapping
    public ResponseEntity<Funcionario> cadastroFuncionario (@RequestBody Funcionario func) {
        func = service.cadastraFuncionarios(func);
        return ResponseEntity.ok().body(func);
    }

}
