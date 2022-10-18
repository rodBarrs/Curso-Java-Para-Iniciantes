package Unidade03.Restaurante;

public class Produto {

    private int idProduto;
    private String nomeProduto;
    private double preco;
    private String descricao;

    private static int contadorId = 1;

    public Produto (String nomeProduto, double preco, String descricao) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.descricao = descricao;

        this.idProduto = contadorId;
        contadorId++;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Produto.contadorId = contadorId;
    }
}
