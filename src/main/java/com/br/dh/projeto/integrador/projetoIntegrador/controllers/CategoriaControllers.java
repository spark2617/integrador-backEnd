package com.br.dh.projeto.integrador.projetoIntegrador.controllers;


import com.br.dh.projeto.integrador.projetoIntegrador.dto.CategoriaDto;
import com.br.dh.projeto.integrador.projetoIntegrador.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaControllers {

    @Autowired
    CategoriaService service;

    @GetMapping
    public ResponseEntity<List<CategoriaDto>> buscarTodosAsCategoria() {
        List<CategoriaDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoriaDto> buscarCategoriaPorId(@PathVariable Integer id) {
        CategoriaDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirCategoria(@PathVariable Integer id) {
        service.excluir(id);
        return ResponseEntity.noContent().build(); // Retorna 204
    }

    @PostMapping
    public ResponseEntity<CategoriaDto> inserirCategoria(@RequestBody CategoriaDto dto) {
        dto = service.inserir(dto); // O dto que retornou agora tem ID
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CategoriaDto> atualizarCategoria(@PathVariable Integer id,  @RequestBody CategoriaDto dto) {
        dto = service.atualizar(id, dto);
        return ResponseEntity.ok().body(dto);
    }

}
