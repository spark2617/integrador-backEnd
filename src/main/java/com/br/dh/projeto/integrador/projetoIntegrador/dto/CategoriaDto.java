package com.br.dh.projeto.integrador.projetoIntegrador.dto;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Categoria;

import java.io.Serializable;

public class CategoriaDto implements Serializable {
    //variavel do Serializable
    private static final long serialVersionUID = 1L;

    //atributo
    private Integer id;
    private String nome;



    //contrutores
    public CategoriaDto(){}

    public CategoriaDto(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    //construtor que recebe objeto, e o controi no D T O
    public CategoriaDto(Categoria categoria){
        this.id=categoria.getId();
        this.nome=categoria.getNome();
    }



    //get e set

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
