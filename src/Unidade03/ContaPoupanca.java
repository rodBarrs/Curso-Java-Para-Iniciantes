package Unidade03;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa){
        saldo += saldo*taxa*3;
    }

}
