package model;

public class Pessoa {
    protected String email;
    protected String nome;
    protected String cpf;
    protected int idade;
    protected int id;
    protected String senha;


    public Pessoa(String nome, String email, String cpf, int idade,int id, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.id = id;
    }

    public void descreverUsuario(){
        System.out.println(nome + "\npossui email: " + email + "\ncom o cpf: " + cpf + "\ne com o idade: " + idade + "\ne com id: " + id);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
