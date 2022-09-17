package br.com.dh.ecommerce.dtos;

import br.com.dh.ecommerce.entities.Produto;

import java.io.Serializable;

public class ProdutoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String image;
    private String description;
    private double price;

    public ProdutoDto() {
    }

    public ProdutoDto(Integer id, String title, String image, String description, double price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public ProdutoDto(Produto entidade) {
        id = entidade.getId();
        title = entidade.getTitle();
        description = entidade.getDescription();
        image = entidade.getImage();

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
