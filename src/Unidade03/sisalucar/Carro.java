package Unidade03.sisalucar;

public class Carro extends Veiculo{

    private long idCarro;
    private String placa;
    private String fabricante;
    private String modelo;
    private int ano;
    private String cor;
    private float valorDiaria;
    private Revendedor revendedor;

    public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria, Revendedor revendedor) {
        super();
        this.setIdCarro(idCarro);
        this.setPlaca(placa);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setCor(cor);
        this.setValorDiaria(valorDiaria);
        this.setRevendedor(revendedor);
    }

    public Carro(){

    }

    public int getPassageiros() {
        return 4;
    }

    public void acelera(int limiteVelocidade){
        System.out.println("Obedeca o limite de velocidade que é: " + limiteVelocidade);
    }


    public void abastecer(int quantidadeLitros){
        System.out.println("Para abastecer o carro é necessário "+ quantidadeLitros);
    }

    public long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(long idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro(1,"ABC-2001","Volks","Gol",2013,"Azul", 99.9f,Revendedor.EMANUELVEICULOS);
        Carro carro2 = new Carro();

        carro1.acelera();
        carro1.freia();
        carro1.getPassageiros();
        carro1.getVelocidade();
        carro1.autonomia = 40;
    }

}
