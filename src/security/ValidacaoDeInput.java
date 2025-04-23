package security;

import java.util.Scanner;

public class ValidacaoDeInput {
    private Scanner scanner;

    public ValidacaoDeInput(){
        scanner = new Scanner(System.in);
    }


    public int lerInteiro(String mensagem){
        String entrada;
        do{
            System.out.println(mensagem);
            entrada = scanner.nextLine();
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
