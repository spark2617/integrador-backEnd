package com.br.dh.projeto.integrador.projetoIntegrador.entities;


public class Categoria {
    private Integer id;
    private String name;


    //construtores
    public Categoria(){}

    public Categoria(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //get e set

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }
}
