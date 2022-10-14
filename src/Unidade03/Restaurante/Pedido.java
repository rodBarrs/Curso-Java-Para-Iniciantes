package Unidade03.Restaurante;

import java.util.ArrayList;

public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private double valorTotal;
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

    }

    public void concluirPedido() {

    }

    public void cancelarPedido () {

    }

}
