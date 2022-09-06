package com.br.dh.projeto.integrador.projetoIntegrador.dto;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;

import java.io.Serializable;

public class ProdutoDto implements Serializable {

    //variavel do Serializable
    private static final long serialVersionUID = 1L;

    // atributo
    private Integer id;
    private String title;
    private String image;
    private String description;
    private double price;


    //construtores
    
    public ProdutoDto(){}

    public ProdutoDto(Integer id, String title, String image, String description, double price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    //construtor que recebe objeto, e o controi no D T O
    public ProdutoDto(Produto produto){
        this.id=produto.getId();
        this.title=produto.getTitle();
        this.image=produto.getImage();
        this.description=produto.getDescription();
        this.price=produto.getPrice();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
