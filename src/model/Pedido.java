package model;

import users.Cliente;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<ProdutoPedido> produtos;
    private Cliente cliente;
    private Endereco endereco;
    private double preco;

    public Pedido(int id, Cliente cliente, Endereco endereco) {
        this.id = id;
        this.cliente = cliente;
        this.endereco = endereco;
        produtos = new ArrayList<>();
        preco = calculaPreco();
    }
    private double calculaPreco() {
        double preco = 0;
        for (ProdutoPedido produto : produtos) {
            preco += produto.getPreco();
        }
        return preco;
    }
    public void fecharPedido(){
        for (ProdutoPedido produtoPedido : produtos) {
            Produto produto = produtoPedido.getProduto();
            produto.setEstoque(produto.getEstoque() - produtoPedido.getQuantidade());
            System.out.println(produto.getEstoque());
        }
        System.out.println("Pedido fechado");
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(new ProdutoPedido(produto, quantidade));
    }
    public void listarProdutos() {
        System.out.println("Listando produtos:");
        for (ProdutoPedido produtoPedido : produtos) {
            System.out.println("-------------------------------------");
            System.out.println(produtoPedido.getProduto().getNome());
            System.out.println(produtoPedido.getQuantidade());
            System.out.println(produtoPedido.getPreco());
            System.out.println("-------------------------------------");
        }
        System.out.println("Preço total: R$" + calculaPreco());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
