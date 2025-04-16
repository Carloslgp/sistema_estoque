package app;

import model.Endereco;
import model.Estoque;
import model.Produto;
import users.Cliente;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Endereco endereco = new Endereco();

        Cliente cliente = new Cliente("Carlos", "carlos@gmail.com", "132-000-800-80", 19, 1, endereco);

        cliente.descreverUsuario();

        Produto produto = new Produto("Monitor 144hz", 100, 1200.0, "Monitor samsung 144hz 1ms", 1);

        estoque.adicionarProduto(produto);

        produto.descreverProduto();

        Produto produto2 = new Produto("Mouse", 100, 600.0, "Mouse gamer Hyperx", 2);

        estoque.adicionarProduto(produto2);

        produto2.descreverProduto();

        cliente.criarEAdicionarPedido(1, endereco, cliente);
        cliente.adicionarProdutoAoPedido(produto2, 2, 0);
        cliente.adicionarProdutoAoPedido(produto, 2, 0);

        cliente.listarPedido(0);
        cliente.fecharPedido(0);

        cliente.criarEAdicionarPedido(2, endereco, cliente);
        cliente.adicionarProdutoAoPedido(produto2, 2, 1);

        cliente.listarPedido(1);
        cliente.fecharPedido(1);

        estoque.listarProdutos();


    }
}
