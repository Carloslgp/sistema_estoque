package ui;
import security.ValidacaoDeInput;
import utilidade.Pausador;


public class MenuInicial {
    private ValidacaoDeInput validator = new ValidacaoDeInput();
    private UserInteraction userInteraction = new UserInteraction();
    private Pausador pausador = new Pausador();

    public MenuInicial(){}


    public void exibirMenuInicial() {

        System.out.println("Bem vindo ao sistema de estoque");
        System.out.println("1 - Entrar como cliente");
        System.out.println("2 - Entrar como administrador");
        System.out.println("3 - Sair");

    }

    public void executarMenuInicial(){
        int opcao = 0;
        while(opcao != 3){
            exibirMenuInicial();

            opcao = userInteraction.lerEntradaMenuInicial();

            if (opcao == 1) {
                System.out.println("Entrando como cliente");
                pausador.esperarSegundos(1);
            }
            else if (opcao == 2) {
                System.out.println("Entrando como administrador");
                pausador.esperarSegundos(1);
            }
            else if (opcao == 0){
                System.out.println("O número digitado não está na lista");
                pausador.esperarSegundos(1);
            }

        }
        System.out.println("Obrigado por utilizar nosso sistema! :)");
        System.out.println("Saindo do sistema...");
    }


}
