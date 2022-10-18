package netbiis.sisrestaurante;

import javax.swing.*;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Produto> listPedido;
    private double totalPedido = 0;
    private int quantidadeProduto;

    public Pedido() {
    }



    public Pedido(Cliente cliente, List<Produto> listPedido) {
        super();
        this.cliente = cliente;
        this.listPedido = listPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListPedido() {
        return listPedido;
    }

    public void setListPedido(List<Produto> listPedido) {
        this.listPedido = listPedido;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public double getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void adicionarProduto(Produto p) {
        listPedido.add(p);
    }

    public void removerProduto(Produto p) {
        listPedido.add(p);
    }

    public String finalizarPedido() {
        return "Confirme o pedido. . .";
    }

    public String calcularConta() {
        String mensagem = "";
        mensagem = "Nome do cliente: " + cliente.getNome()+"\n";
        for(Produto p: getListPedido()) {
            mensagem += p.getNomeProduto() + " ==> " + "R$" + String.format("%.2f", p.getPrecoProduto())+ "\n";
            totalPedido = totalPedido + p.getPrecoProduto();
        }
        return mensagem += "Total do pedido: " + getTotalPedido();
    }

    public void calcularTotalPedido() {

        for(Produto p: getListPedido()) {
            totalPedido = totalPedido + p.getPrecoProduto();
        }
        System.out.println("Total do pedido: " + getTotalPedido());

    }
    public void realizarPagamento(String formaDePagamento, String cupomDeDesconto){
        if (formaDePagamento.contains("Dinheiro"))
            totalPedido *= 0.98;
        if (cupomDeDesconto.contains("DevNetbiis10"))
            totalPedido *= 0.9;
        if (cupomDeDesconto.contains("DevNetbiis20"))
            totalPedido *= 0.8;

        JOptionPane.showMessageDialog(null,"Conta Fechada no valor de R$"+totalPedido+"!\n" +
                "Obrigado e volte sempre!");
    }
}
