package br.com.dh.clinica.controllers;

import br.com.dh.clinica.dtos.ProdutoDto;
import br.com.dh.clinica.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> buscarTodosOsEnderecos() {
        List<ProdutoDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> buscarEnderecoPorId(@PathVariable Integer id) {
        ProdutoDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirProduto(@PathVariable Integer id) {
        service.excluir(id);
        return ResponseEntity.noContent().build(); // Retorna 204
    }

    @PostMapping
    public ResponseEntity<ProdutoDto> inserirEndereco(@RequestBody ProdutoDto dto) {
        dto = service.inserir(dto); // O dto que retornou agora tem ID
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProdutoDto> atualizarEndereco(@PathVariable Integer id,  @RequestBody ProdutoDto dto) {
        dto = service.atualizar(id, dto);
        return ResponseEntity.ok().body(dto);
    }

}
