package br.com.dh.ecommerce.dtos;

import br.com.dh.ecommerce.entities.Categoria;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

public class CategoriaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    private Set<ProdutoDto> produtos = new HashSet<>();

    public CategoriaDto() {
    }

    public CategoriaDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoriaDto(Categoria entidade) {
        id = entidade.getId();
        name = entidade.getName();

        entidade.getProdutos().forEach(end -> this.produtos.add(new ProdutoDto(end)));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProdutoDto> getProdutos() {
        return produtos;
    }
}
