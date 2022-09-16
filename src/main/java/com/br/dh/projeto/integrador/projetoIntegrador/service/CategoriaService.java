package com.br.dh.projeto.integrador.projetoIntegrador.service;

import com.br.dh.projeto.integrador.projetoIntegrador.dto.CategoriaDto;
import com.br.dh.projeto.integrador.projetoIntegrador.dto.ProdutoDto;
import com.br.dh.projeto.integrador.projetoIntegrador.entities.Categoria;
import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;
import com.br.dh.projeto.integrador.projetoIntegrador.repository.CategoriaRepository;
import com.br.dh.projeto.integrador.projetoIntegrador.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional(readOnly = true)
    public List<CategoriaDto> buscarTodas() {
        List<Categoria> list = repository.findAll();
        return list.stream().map(x -> new CategoriaDto(x)).collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public CategoriaDto buscarPorId(Integer id) {
        Optional<Categoria> objeto = repository.findById(id);
        Categoria entidade = objeto.get();
        return new CategoriaDto(entidade);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    @Transactional
    public CategoriaDto inserir(CategoriaDto dto) {
        Categoria entidade = new Categoria();
        entidade.setNome(dto.getName());
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
    }

    @Transactional
    public CategoriaDto atualizar(Integer id, CategoriaDto dto) {
        Categoria entidade = repository.getReferenceById(id);
        entidade.setNome(dto.getName());
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
    }


    private void copiarDtoParaEntidade(CategoriaDto dto, Categoria entidade) {
       entidade.setNome(dto.getName());

        entidade.getProdutos().clear();
        for (ProdutoDto endDto : dto.getProdutos()) {
            Produto produto = produtoRepository.getReferenceById(endDto.getId());
            entidade.getProdutos().add(produto);
        }
    }


}
