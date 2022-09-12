package com.br.dh.projeto.integrador.projetoIntegrador.controllers;


import com.br.dh.projeto.integrador.projetoIntegrador.dto.ProdutoDto;
import com.br.dh.projeto.integrador.projetoIntegrador.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")  //endpoint: http://localhost:9000/produtos
public class ProdutoControllers {

    @Autowired
    ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> buscarTodosOsProduto() {
        List<ProdutoDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

<<<<<<< HEAD
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> buscarProdutoPorId(@PathVariable Integer id) {
=======
    @GetMapping(value = "/{id}")  //endpoint: http://localhost:9000/produtos/{id}
    public ResponseEntity<ProdutoDto> buscarDentistaPorId(@PathVariable Integer id) {
>>>>>>> 1a524546144e3e322110e864ec62e2e460820815
        ProdutoDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

<<<<<<< HEAD
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirProduto(@PathVariable Integer id) {
=======
    @DeleteMapping(value = "/{id}") //endpoint: http://localhost:9000/produtos/{id}
    public ResponseEntity<Void> excluirDentista(@PathVariable Integer id) {
>>>>>>> 1a524546144e3e322110e864ec62e2e460820815
        service.excluir(id);
        return ResponseEntity.noContent().build(); // Retorna 204
    }

<<<<<<< HEAD
    @PostMapping
    public ResponseEntity<ProdutoDto> inserirProduto(@RequestBody ProdutoDto dto) {
=======
    @PostMapping //endpoint: http://localhost:9000/produtos
    public ResponseEntity<ProdutoDto> inserirDentista(@RequestBody ProdutoDto dto) {
>>>>>>> 1a524546144e3e322110e864ec62e2e460820815
        dto = service.inserir(dto); // O dto que retornou agora tem ID
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

<<<<<<< HEAD
    @PutMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> atualizarProduto(@PathVariable Integer id,  @RequestBody ProdutoDto dto) {
=======
    @PutMapping(value = "/{id}") //endpoint: http://localhost:9000/produtos/{id}
    public ResponseEntity<ProdutoDto> atualizarDentista(@PathVariable Integer id,  @RequestBody ProdutoDto dto) {
>>>>>>> 1a524546144e3e322110e864ec62e2e460820815
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
