package Unidade03.sisalucar;

public class Onibus extends Veiculo{

    public int getPassageiros() {
        return 40;
    }

    public void acelera(int limiteVelocidade){
        System.out.println("Obedeca o limite de velocidade que é: " + limiteVelocidade);
    }


}
