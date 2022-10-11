package Unidade03.sisalucar;

public class Moto extends Veiculo{

    public int getPassageiros() {
        return 1;
    }

    public void acelera(int limiteVelocidade){
        System.out.println("Obedeca o limite de velocidade que é: " + limiteVelocidade);
    }

}
