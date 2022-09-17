package br.com.dh.ecommerce.services;

import br.com.dh.ecommerce.dtos.ProdutoDto;
import br.com.dh.ecommerce.entities.Produto;
import br.com.dh.ecommerce.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    // buscar todos
    @Transactional(readOnly = true)
    public List<ProdutoDto> buscarTodos() {
        List<Produto> list = repository.findAll();
        return list.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
    }

    // buscar por ID
    @Transactional(readOnly = true)
    public ProdutoDto buscarPorId(Integer id) {
        Optional<Produto> objeto = repository.findById(id);
        Produto entidade = objeto.get();
        return new ProdutoDto(entidade);
    }

    // inserir
    @Transactional
    public ProdutoDto inserir(ProdutoDto dto) {
        Produto entity = new Produto();
        copiarDtoParaEntidade(dto, entity);
        entity = repository.save(entity);
        return new ProdutoDto(entity);
    }

    // atualizar
    @Transactional
    public ProdutoDto atualizar(Integer id, ProdutoDto dto) {
        Produto entity = repository.getReferenceById(id);
        copiarDtoParaEntidade(dto, entity);
        entity = repository.save(entity);
        return new ProdutoDto(entity);
    }

    // deletar
    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    private void copiarDtoParaEntidade(ProdutoDto dto, Produto entidade) {
        entidade.setTitle(dto.getTitle());
        entidade.setImage(dto.getImage());
        entidade.setDescription(dto.getDescription());
        entidade.setPrice(dto.getPrice());
    }
}
