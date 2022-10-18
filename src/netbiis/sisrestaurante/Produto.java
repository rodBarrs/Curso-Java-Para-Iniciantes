package netbiis.sisrestaurante;

public class Produto {

    private String categoriaProduto;
    private String nomeProduto;
    private int idProduto;
    public static int incrementadorId = 1;
    private double precoProduto;

    private String descricao;

    public Produto() {
    }

    public Produto(String categoriaProduto, String nomeProduto, double precoProduto,String descricao) {
        super();
        this.categoriaProduto = categoriaProduto;
        this.nomeProduto = nomeProduto;
        this.idProduto = incrementadorId;
        this.precoProduto = precoProduto;
        this.descricao = descricao;
        incrementadorId++;

    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}