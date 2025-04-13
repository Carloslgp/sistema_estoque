package users;

import model.Endereco;
import model.Pedido;
import model.Pessoa;

public class Cliente extends Pessoa{
    private Endereco endereco;
    private Pedido pedido;

    public Cliente(String nome, String email, String cpf, int idade,int id,Endereco endereco){

        super(nome, email, cpf, idade, id);
        this.endereco = endereco;
    }


}
