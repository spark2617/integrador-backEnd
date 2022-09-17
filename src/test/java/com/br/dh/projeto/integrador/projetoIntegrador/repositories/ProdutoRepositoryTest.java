package com.br.dh.projeto.integrador.projetoIntegrador.repositories;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;
import com.br.dh.projeto.integrador.projetoIntegrador.repository.ProdutoRepository;
import com.br.dh.projeto.integrador.projetoIntegrador.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository repository;

    private Integer idExistente;
    private Integer idNaoExistente;
    private Integer countTotalProdutos;
    private List<Produto> produtoList;

    @BeforeEach
    void setup() throws Exception{
        idExistente = 1;
        idNaoExistente = 99;
        countTotalProdutos = 20;
        produtoList = new ArrayList<>();
    }


    @Test
    public void
        saveDeveriaSalvarComAutoIncrementoQuandoOIdForNulo() {
        Produto produto = Factory.criarProduto();
        produto = repository.save(produto);

        Assertions.assertNotNull(produto.getId());
        Assertions.assertArrayEquals(countTotalProdutos +
                1, produto.getId());
    }

}
