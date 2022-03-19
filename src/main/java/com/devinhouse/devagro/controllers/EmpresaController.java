package com.devinhouse.devagro.controllers;

import com.devinhouse.devagro.models.Empresa;
import com.devinhouse.devagro.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping
    public ResponseEntity <List<Empresa>> findAll () {
        List<Empresa> listaEmpresa = service.findAll();
        return ResponseEntity.ok().body(listaEmpresa);
    }

    @GetMapping("/{id}")
        ResponseEntity<Empresa> findById(@PathVariable Long id) {
        Empresa emp = service.findById(id);
        return ResponseEntity.ok().body(emp);
    }

    @PostMapping
        public ResponseEntity<Empresa> cadastroFazenda (@RequestBody Empresa emp){
        emp = service.cadastraEmpresa(emp);
        return ResponseEntity.ok().body(emp);
    }

}
