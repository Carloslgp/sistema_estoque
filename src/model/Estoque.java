package model;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.descreverProduto();
        }
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

}
