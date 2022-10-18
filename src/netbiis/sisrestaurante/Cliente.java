package netbiis.sisrestaurante;

public class Cliente {

    private int idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String cartaoCredito;
    Pedido ped;
    public static int incrementadorId = 1;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String cartaoCredito, String telefone) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cartaoCredito = cartaoCredito;
        this.telefone = telefone;
        this.idCliente = incrementadorId;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Pedido getPed() {
        return ped;
    }

    public void setPed(Pedido ped) {
        this.ped = ped;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}