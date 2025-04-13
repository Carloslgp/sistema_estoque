package app;

import model.Endereco;
import model.Pedido;
import model.Produto;
import users.Cliente;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente("Carlos", "carlos@gmail.com", "132-000-800-80", 19, 1, endereco);
        cliente.descreverUsuario();

        Produto produto = new Produto("Monitor 144hz", 100, 1200.0, "Monitor samsung 144hz 1ms", 1);
        produto.descreverProduto();

        Pedido pedido = new Pedido(1, cliente, endereco);
        pedido.adicionarProduto(produto, 2);
        pedido.listarProdutos();
        pedido.fecharPedido();

    }
}
