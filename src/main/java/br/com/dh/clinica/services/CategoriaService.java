package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.CategoriaDto;
import br.com.dh.clinica.dtos.ProdutoDto;
import br.com.dh.clinica.entities.Categoria;
import br.com.dh.clinica.entities.Produto;
import br.com.dh.clinica.repositories.CategoriaRepository;
import br.com.dh.clinica.repositories.ProdutoRepository;
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
    public List<CategoriaDto> buscarTodos() {
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
        copiarDtoParaEntidade(dto, entidade);
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
    }

    @Transactional
    public CategoriaDto atualizar(Integer id, CategoriaDto dto) {
        Categoria entidade = repository.getReferenceById(id);
        copiarDtoParaEntidade(dto, entidade);
        entidade = repository.save(entidade);
        return new CategoriaDto(entidade);
    }

    private void copiarDtoParaEntidade(CategoriaDto dto, Categoria entidade) {
        entidade.setNome(dto.getNome());
        entidade.setEmail(dto.getEmail());
        entidade.setCpf(dto.getCpf());
        entidade.setDatacadastro(dto.getDatacadastro());

        entidade.getEnderecos().clear();
        for (ProdutoDto endDto : dto.getEnderecos()) {
            Produto produto = produtoRepository.getReferenceById(endDto.getId());
            entidade.getEnderecos().add(produto);
        }
    }
}
