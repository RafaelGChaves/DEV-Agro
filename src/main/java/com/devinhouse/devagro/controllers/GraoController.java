package com.devinhouse.devagro.controllers;

import com.devinhouse.devagro.models.Grao;
import com.devinhouse.devagro.services.GraoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/graos")
public class GraoController {

    @Autowired
    private GraoService service;

    @GetMapping
    public ResponseEntity <List<Grao>> findAll () {
        List<Grao> listaGrao = service.findAll();
        return ResponseEntity.ok().body(listaGrao);
    }
   

    @GetMapping("/{id}")
        ResponseEntity<Grao> findById(@PathVariable Long id) {
        Grao gr = service.findById(id);
        return ResponseEntity.ok().body(gr);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Grao>> getGraoByEmpresaID (@PathVariable Long id) {
        List<Grao> listaGraos = service.getGraoByEmpresaId(id);
        return ResponseEntity.ok().body(listaGraos);
    }

    @PostMapping
    public ResponseEntity<Grao> cadastroGrao (@RequestBody Grao gr) {
        gr = service.cadastraGraos(gr);
        return ResponseEntity.ok().body(gr);
    }
}
