package Unidade03.Restaurante;

import java.util.ArrayList;

public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double valorTotal = 0;
    private String formaDePagamento;

    private static int contadorId = 1;

    public Pedido(Cliente cliente) {
        this.idPedido = Pedido.contadorId;
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
        contadorId++;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        this.valorTotal += produto.getPreco();

    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
        this.valorTotal -= produto.getPreco();
    }


    public void listarPedido() {
        System.out.println("Pedido: "+ idPedido);
        System.out.println("Cliente "+ cliente.getNome());
        for (Produto produto: produtos) {
            System.out.println(produto.getNomeProduto()+ " -  "+ produto.getPreco());
        }
        System.out.println("Total: "+ valorTotal);
    }

    public void concluirPedido() {
       listarPedido();

    }



}
