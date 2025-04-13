package model;

public class Produto {
    private int id;
    private String nome;
    private int estoque;
    private double precoUnitario;
    private String descricao;

    public Produto(String nome, int estoque, double precoUnitario, String descricao, int id) {
        this.nome = nome;
        this.estoque = estoque;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        this.id = id;
    }
    public void descreverProduto() {
        System.out.println("O " + nome + "\nTem estoque de: " +estoque+ " Unidades\nPreço: R$" + precoUnitario + "\nSua descrição é: " + descricao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getprecoUnitario() {
        return precoUnitario;
    }
    public void setprecoUnitario() {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
