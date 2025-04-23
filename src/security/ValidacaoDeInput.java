package security;

import utilidade.Pausador;

import java.util.Scanner;

public class ValidacaoDeInput {
    private Scanner scanner;
    private Pausador pausador = new Pausador();

    public ValidacaoDeInput(){
        scanner = new Scanner(System.in);
    }


    public int lerInteiro(String mensagem){
        String entrada;
        do{
            System.out.println(mensagem);
            entrada = scanner.nextLine();
            if (!tryParseInt(entrada)) {
                System.out.println("Parece que o que você digitou não é um número. Tente novamente.");
                pausador.esperarSegundos(1);
            }
        }while (tryParseInt(entrada) == false);
        return Integer.parseInt(entrada);
    }

    private boolean tryParseInt(String entrada){
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
