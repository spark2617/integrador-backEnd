package com.br.dh.projeto.integrador.projetoIntegrador.service;


import com.br.dh.projeto.integrador.projetoIntegrador.dto.ProdutoDto;
import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;
import com.br.dh.projeto.integrador.projetoIntegrador.repository.ProdutoRepository;
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


    @Transactional(readOnly = true)
    public List<ProdutoDto> buscarTodos() {
        List<Produto> list = repository.findAll();
        return list.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public ProdutoDto buscarPorId(Integer id) {
        Optional<Produto> objeto = repository.findById(id);
        Produto entidade = objeto.get();
        return new ProdutoDto(entidade);
    }


    public void excluir(Integer id) {
        repository.deleteById(id);
    }


    @Transactional
    public ProdutoDto inserir(ProdutoDto dto) {
        Produto entidade = new Produto();
        entidade.setTitle(dto.getTitle());
        entidade.setImage(dto.getImage());
        entidade.setDescription(dto.getDescription());
        entidade.setPrice(dto.getPrice());
        entidade = repository.save(entidade);
        return new ProdutoDto(entidade);
    }


    @Transactional
    public ProdutoDto atualizar(Integer id , ProdutoDto dto) {
        Produto entidade = repository.getReferenceById(id);
        entidade.setTitle(dto.getTitle());
        entidade.setImage(dto.getImage());
        entidade.setDescription(dto.getDescription());
        entidade.setPrice(dto.getPrice());
        entidade = repository.save(entidade);
        return new ProdutoDto(entidade);
    }

    private void copiarDtoParaEntidade(ProdutoDto dto, Produto entidade) {
        entidade.setTitle(dto.getTitle());
        entidade.setDescription(dto.getDescription());
        entidade.setImage(dto.getImage());
        entidade.setPrice(dto.getPrice());
    }

}
