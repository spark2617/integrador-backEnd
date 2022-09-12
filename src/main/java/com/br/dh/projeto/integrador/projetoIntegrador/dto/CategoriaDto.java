package com.br.dh.projeto.integrador.projetoIntegrador.dto;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Categoria;


import java.io.Serializable;

public class CategoriaDto implements Serializable {

    //variavel do Serializable
    private static final long serialVersionUID = 1L;

    // atributo
    private Integer id;
    private String name;


    //construtores

    public CategoriaDto(){}

    public CategoriaDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //construtor que recebe objeto, e o controi no D T O
    public CategoriaDto(Categoria entities) {
        this.id=entities.getId();
        this.name=entities.getName();
    }


    //get e set


    public static long getSerialVersionUID() {
        return serialVersionUID;
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
}
