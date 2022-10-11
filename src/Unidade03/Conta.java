package Unidade03;

public class Conta {

    int numero;
    protected double saldo;
    double limite;
    private Cliente cliente[];


    public boolean saca (double valor){

        if (valor <= saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }

    }


    public void deposita (double valor){
        saldo += valor;
    }

    public void transfere (Conta destino, double valor){

        if (valor <= saldo) {
          this.saldo = this.saldo;
        }
        else{
        System.out.println("Não foi possível realizar a transferência");
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo*taxa;
    }


    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = new Cliente[5];



    }


}
