package com.br.dh.projeto.integrador.projetoIntegrador.entities;



import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;


    // os dados do relacionamento são retornados juntos.
    @ManyToMany(fetch = FetchType.EAGER)
    //Cria uma tabela nova para relacionar as duas entidades paciente e endereço
    @JoinTable(name = "categoria_produto",
            //informamos o nome da tabela e as tabelas que usaremos
            //@joinComum- define as colunas da tabela
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos = new HashSet<>();



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

    public Set<Produto> getProdutos() {return produtos;}

}
