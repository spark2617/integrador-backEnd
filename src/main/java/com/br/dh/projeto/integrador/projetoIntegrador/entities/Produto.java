package com.br.dh.projeto.integrador.projetoIntegrador.entities;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String image;
    private String description;
    private double price;


    //construtores


    public Produto() {
    }

    public Produto(Integer id, String title, String image,String description,double price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.description=description;
    }

    //get e set

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
