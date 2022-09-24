package br.com.dh.ecommerce.services;

import br.com.dh.ecommerce.dtos.CategoriaDto;
import br.com.dh.ecommerce.dtos.ProdutoDto;
import br.com.dh.ecommerce.entities.Categoria;
import br.com.dh.ecommerce.entities.Produto;
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
        //Produto entidade = objeto.get();
        Produto entidade = objeto.orElseThrow(() -> new EntityNotFoundException("Registro: "+id+"Não encontrado"));
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
        try{
        Produto entidade = repository.getReferenceById(id);
        copiarDtoParaEntidade(dto, entidade);
            entidade = repository.save(entidade);
        return new ProdutoDto(entidade);}
        catch(EntityNotFoundException e){
            throw new EntityNotFoundException("Registro "+id+" Não encontrado!");
        }
    }

    // deletar
    public void excluir(Integer id) {
        try{repository.deleteById(id);}
        catch(EmptyResultDataAccessException e){
            throw new EntityNotFoundException("Registro: "+id+"não encontrado!");
        }
        catch(DataIntegrityViolationException e){
            throw new DataBaseException("Não foi possível apagar o registro:" +
                    id+" pois ele está vinculado a uma categoria ." +
                    " apague o produto da CATEGORIA e depois apague o produto em si.");
        }

    }

    private void copiarDtoParaEntidade(ProdutoDto dto, Produto entidade) {
        entidade.setTitle(dto.getTitle());
        entidade.setImage(dto.getImage());
        entidade.setDescription(dto.getDescription());
        entidade.setPrice(dto.getPrice());
    }
}
