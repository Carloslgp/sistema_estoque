package model;

public class Pessoa {
    private String email;
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, String email, String cpf, int idade) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void descreverUsuario(){
        System.out.println(nome + "\npossui email: " + email + "\ncom o cpf: " + cpf + "\ne com o idade: " + idade);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
