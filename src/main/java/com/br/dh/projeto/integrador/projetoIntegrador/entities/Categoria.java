package com.br.dh.projeto.integrador.projetoIntegrador.entities;


<<<<<<< HEAD
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

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
