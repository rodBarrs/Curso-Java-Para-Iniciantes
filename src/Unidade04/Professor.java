package Unidade04;

public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte{
    @Override
    public void getBonificacao() {

    }

    @Override
    public boolean autentica(String senha) {
        return false;
    }

    @Override
    public void vota() {

    }

    @Override
    public String getRG() {
        return null;
    }

    @Override
    public void pagaIR() {

    }

    @Override
    public String getCPF() {
        return null;
    }
}
