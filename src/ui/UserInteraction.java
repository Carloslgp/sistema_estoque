package ui;

import security.ValidacaoDeInput;

public class UserInteraction {

    public UserInteraction(){}

    public int lerEntradaMenuInicial(){
        ValidacaoDeInput validator = new ValidacaoDeInput();
        int opcao = validator.lerInteiro("Digite a opção desejada: ");

        if (opcao == 1) {
            return 1;
        } else if (opcao == 2) {
            return 2;
        } else if (opcao == 3) {
            return 3;
        } else {
            return 0;
        }
    }

}
