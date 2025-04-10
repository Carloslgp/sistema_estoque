package app;

import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", "carlos@gmail.com", "132-000-800-80", 19);
        pessoa.descreverUsuario();
    }
}
