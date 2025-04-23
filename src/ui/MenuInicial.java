package ui;

import security.ValidacaoDeInput;

public class MenuInicial {
    private ValidacaoDeInput validator = new ValidacaoDeInput();


    public void ExibirMenuInicial() {

        System.out.println("Bem vindo ao sistema de estoque");
        System.out.println("1 - Entrar como cliente");
        System.out.println("2 - Entrar como administrador");
        System.out.println("3 - Sair");

    }
}
