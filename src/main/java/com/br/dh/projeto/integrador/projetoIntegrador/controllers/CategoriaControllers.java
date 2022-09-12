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
@RequestMapping(value = "/categoria")  //endpoint: http://localhost:9000/produtos
public class CategoriaControllers {

    @Autowired
    CategoriaService service;

    @GetMapping
    public ResponseEntity<List<CategoriaDto>> buscarTodosOsProduto() {
        List<CategoriaDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoriaDto> buscarProdutoPorId(@PathVariable Integer id) {



        CategoriaDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }


    @DeleteMapping(value = "/{id}")//endpoint: http://localhost:9000/produtos/{id}
    public ResponseEntity<Void> excluirProduto(@PathVariable Integer id) {



        service.excluir(id);
        return ResponseEntity.noContent().build(); // Retorna 204
    }


    @PostMapping //endpoint: http://localhost:9000/produtos
    public ResponseEntity<CategoriaDto> inserirProduto(@RequestBody CategoriaDto dto) {




        dto = service.inserir(dto); // O dto que retornou agora tem ID
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }


    @PutMapping(value = "/{id}") //endpoint: http://localhost:9000/produtos/{id}
    public ResponseEntity<CategoriaDto> atualizarProduto(@PathVariable Integer id,  @RequestBody CategoriaDto dto) {
        dto = service.atualizar(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    /* Exemplo de body
     {
      "title":"item",
      "image":"https://image.com.br",
      "description":"Um belo item",
      "price": 1.99
     }
      */

}
