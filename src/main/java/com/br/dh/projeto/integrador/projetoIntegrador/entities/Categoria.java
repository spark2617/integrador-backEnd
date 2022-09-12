package com.br.dh.projeto.integrador.projetoIntegrador.entities;


import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;


    //construtores
    public Categoria(){}

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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
