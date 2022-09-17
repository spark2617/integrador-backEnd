package com.br.dh.projeto.integrador.projetoIntegrador.tests;

import com.br.dh.projeto.integrador.projetoIntegrador.dto.ProdutoDto;
import com.br.dh.projeto.integrador.projetoIntegrador.entities.Produto;

public class Factory {

    public static Produto criarProduto() {
        Produto produto = new Produto(null, "Iphone Pro Max 14", "img jpg", "é um iphone",14999.99);
        return produto;
    }

    public static ProdutoDto criarProdutoDto() {
        Produto produto = criarProduto();
        return new ProdutoDto(produto);
    }
}
