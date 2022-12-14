package br.com.dh.ecommerce.services;

import br.com.dh.ecommerce.dtos.CategoriaDto;
import br.com.dh.ecommerce.dtos.ProdutoDto;
import br.com.dh.ecommerce.entities.Categoria;
import br.com.dh.ecommerce.entities.Produto;
import br.com.dh.ecommerce.repositories.CategoriaRepository;
import br.com.dh.ecommerce.repositories.ProdutoRepository;
import br.com.dh.ecommerce.services.Exceptions.DataBaseException;
import br.com.dh.ecommerce.services.Exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
    public List<CategoriaDto> buscarTodos() {


          List<Categoria> list = repository.findAll();
          return list.stream().map(x -> new CategoriaDto(x)).collect(Collectors.toList());


    }

    @Transactional(readOnly = true)
    public CategoriaDto buscarPorId(Integer id) {
        Optional<Categoria> objeto = repository.findById(id);
        //Categoria entidade = objeto.get();
        Categoria entidade = objeto.orElseThrow(() -> new EntityNotFoundException("Registro: "+id+"Não encontrado"));
        return new CategoriaDto(entidade);
    }

    public void excluir(Integer id) {

        try{repository.deleteById(id);}
        catch(EmptyResultDataAccessException e){
            throw new EntityNotFoundException("Registro: "+id+"não encontrado!");
        }
    }

    @Transactional
    public CategoriaDto inserir(CategoriaDto dto) {
        Categoria entidade = new Categoria();
        copiarDtoParaEntidade(dto, entidade);
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
    }

    @Transactional
    public CategoriaDto atualizar(Integer id, CategoriaDto dto) {
        try{
        Categoria entidade = repository.getReferenceById(id);
        copiarDtoParaEntidade(dto, entidade);
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
        }
        catch(javax.persistence.EntityNotFoundException e){
            throw new EntityNotFoundException("Registro "+id+" Não encontrado!");
        }

    }


    private void copiarDtoParaEntidade(CategoriaDto dto, Categoria entidade) {
        entidade.setName(dto.getName());

        entidade.getProdutos().clear();
        for (ProdutoDto endDto : dto.getProdutos()) {
            Produto produto = produtoRepository.getReferenceById(endDto.getId());
            entidade.getProdutos().add(produto);
        }
    }
}
