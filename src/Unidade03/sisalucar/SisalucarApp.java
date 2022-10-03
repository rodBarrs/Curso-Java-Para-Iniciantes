package Unidade03.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.idCarro = 1;
        carro1.modelo = "gol";
        carro1.placa = "jdk-0001";
        carro1.cor = "azul";
        carro1.ano = 2013;
        carro1.fabricante = "volkswagem";

        Carro carro2 = new Carro();

        Cliente cliente1 = new Cliente();
        cliente1.idCliente = 1;
        cliente1.cpf = "12345678-90";
        cliente1.nome = "Rodrigo Barros";
        cliente1.cnh = "XYZ0001";

        Cliente cliente2 = new Cliente();

    }


    public void realizarLocacao(long idCarro, long idCliente){
        Locacao locacao= new Locacao();
        locacao.idCarro = idCarro;
        locacao.idCliente = idCliente;
        locacao.idLocacao = 1;
        locacao.dataInicial = LocalDate.now();
        locacao.dataFinal = LocalDate.now().plusDays(2);
        locacao.valorLocado = 2 * 99.9f;
    }


    public void gerarRelatorioLocacao (LocalDate dataInicial, LocalDate dataFinal){
        
    }

}
