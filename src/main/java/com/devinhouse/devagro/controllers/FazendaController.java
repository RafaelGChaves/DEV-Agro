package com.devinhouse.devagro.controllers;

import com.devinhouse.devagro.controllers.dto.FazendaDto;
import com.devinhouse.devagro.controllers.dto.FazendaEstoqueDto;
import com.devinhouse.devagro.models.Fazenda;
import com.devinhouse.devagro.services.FazendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/fazendas")
public class FazendaController {

    @Autowired
    private FazendaService service;

    @GetMapping
    public ResponseEntity <List<Fazenda>> findAll () {
        List<Fazenda> listaFazenda = service.findAll();
        return ResponseEntity.ok().body(listaFazenda);
    }

    @GetMapping("/{id}")
       public ResponseEntity<Fazenda> findById(@PathVariable Long id) {
            Fazenda faz = service.findById(id);
            return ResponseEntity.ok().body(faz);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Fazenda>> getFazendasByEmpresasId(@PathVariable Long id) {
        List<Fazenda> listaFazenda = service.getFazendaByEmpresaId(id);
        return ResponseEntity.ok().body(listaFazenda);
    }

    @GetMapping("/empresa/quantidade/{id}")
    public Long numeroFazendasEmpresa (@PathVariable Long id) {
        return service.numeroFazendasEmpresa(id);
    }

    @GetMapping("/colheita/{id}")
    public ResponseEntity<List<FazendaDto>> getFazendasDtoByEmpresasId (@PathVariable Long id) {
        List<Fazenda> list = service.getFazendaByEmpresaId(id);
        List<FazendaDto> listDto = list.stream().map(faz -> new FazendaDto(faz)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping("/estoque/{id}")
    public ResponseEntity<List<FazendaEstoqueDto>> getFazendaEstoqueByEmpresaId (@PathVariable Long id) {
        List<Fazenda> list = service.getFazendaByEmpresaId(id);
        List<FazendaEstoqueDto> listDto = list.
                stream().map(faz -> new FazendaEstoqueDto(faz)).
                sorted(Comparator.comparing(FazendaEstoqueDto::getEstoqueGrao).
                        reversed()).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<Fazenda> cadastroFazenda (@RequestBody Fazenda faz){
        faz = service.cadastroFazenda(faz);
        return ResponseEntity.ok().body(faz);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleta(@PathVariable Long id) {
     service.deleta(id);
     return ResponseEntity.noContent().build();
    }

    @PutMapping("/acrescentaEst/{id}")
    public Fazenda acrescentaEst(@PathVariable Long id,@RequestBody Fazenda acrescimo) {
        return service.acrescentaEstoque(id, acrescimo);
    }

    @PutMapping("/decrementaEst/{id}")
    public Fazenda decrementaEst(@PathVariable Long id, @RequestBody Fazenda descrescimo) {
        return service.decrementaEstoque(id, descrescimo);
    }
}
