package app;

import model.Endereco;
import model.Estoque;
import model.Produto;
import ui.MenuInicial;
import ui.UserInteraction;
import users.Cliente;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        UserInteraction userInteraction = new UserInteraction();
        MenuInicial menuInicial = new MenuInicial();
        Estoque estoque = new Estoque();


        Endereco endereco = new Endereco();

        Cliente cliente = new Cliente("Carlos", "carlos@gmail.com", "132-000-800-80", 19, 1, endereco, "1234");

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

        while(opcao != 3){
            menuInicial.ExibirMenuInicial();
            opcao = userInteraction.lerEntradaMenuInicial();
            if (opcao == 1) {
                System.out.println("Entrando como cliente");
            }
            else if (opcao == 2) {
                System.out.println("Entrando como administrador");
            }
            else if (opcao == 0){
                System.out.println("O número digitado não está na lista");
            }
        }
        System.out.println("Obrigado por utilizar nosso sistema! :)");
        System.out.println("Saindo do sistema...");






    }
}
