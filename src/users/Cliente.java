package users;

import model.*;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private Endereco endereco;
    private ArrayList<Pedido> pedidos;


    public Cliente(String nome, String email, String cpf, int idade,int id,Endereco endereco, String senha){
        super(nome, email, cpf, idade, id,senha);
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }



    public void listarPedidos(){
        int contador = 0;
        for (Pedido pedido : pedidos){
            contador++;
            pedido.listarProdutos(contador);
        }
    }
    public void listarPedido(int indice){
        pedidos.get(indice).listarProdutos(indice);
    }

    public void criarEAdicionarPedido(int id,Endereco endereco, Cliente cliente){
        Pedido pedido = new Pedido(id, endereco, cliente);
        pedidos.add(pedido);

    }
    public void adicionarProdutoAoPedido(Produto produto, int quantidade, int indice){
        Pedido pedido = this.pedidos.get(indice);
        pedido.adicionarProduto(produto, quantidade);
    }

    private void cadastrarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void fecharPedido(int indice){
        pedidos.get(indice).fecharPedido();
    }



    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
