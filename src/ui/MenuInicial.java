package ui;

import security.ValidacaoDeInput;

public class MenuInicial {
    private ValidacaoDeInput validator = new ValidacaoDeInput();


    public void ExibirMenuInicial() {

        System.out.println("Bem vindo ao sistema de estoque");
        System.out.println("1 - Entrar como cliente");
        System.out.println("2 - Entrar como administrador");
        System.out.println("3 - Sair");

        while (true) {
            int opcao = validator.lerInteiro("Digite a opção desejada: ");

            if (opcao == 1) {
                System.out.println("Entrou para fazer login como cliente");
            } else if (opcao == 2) {
                System.out.println("Entrou para fazer login como administrador");
            } else if (opcao == 3) {
                System.out.println("Saindo do sistema");
                break;
            } else {
                System.out.println("A opção digitada não existe");
            }

        }
    }
}
