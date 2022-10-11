package Unidade03;

public class ContaCorrente extends Conta{

    public void atualiza(double taxa){
        saldo += saldo*taxa*2;
    }

}
