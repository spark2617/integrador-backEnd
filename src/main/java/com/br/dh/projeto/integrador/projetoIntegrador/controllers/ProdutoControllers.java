package com.br.dh.projeto.integrador.projetoIntegrador.controllers;


import com.br.dh.projeto.integrador.projetoIntegrador.dto.ProdutoDto;
import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;
import com.br.dh.projeto.integrador.projetoIntegrador.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoControllers {

    @Autowired
    ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> buscarTodosOsDentistas() {
        List<ProdutoDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> buscarDentistaPorId(@PathVariable Integer id) {
        ProdutoDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirDentista(@PathVariable Integer id) {
        service.excluir(id);
        return ResponseEntity.noContent().build(); // Retorna 204
    }

    @PostMapping
    public ResponseEntity<ProdutoDto> inserirDentista(@RequestBody ProdutoDto dto) {
        dto = service.inserir(dto); // O dto que retornou agora tem ID
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> atualizarDentista(@PathVariable Integer id,  @RequestBody ProdutoDto dto) {
        dto = service.atualizar(id, dto);
        return ResponseEntity.ok().body(dto);
    }

}
