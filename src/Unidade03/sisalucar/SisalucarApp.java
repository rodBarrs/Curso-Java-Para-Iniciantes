package Unidade03.sisalucar;

import Unidade03.Cliente;

import java.time.LocalDate;

public class SisalucarApp {


    static int totalCarros = 0;

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setIdCarro(1);
        carro1.setModelo("gol");
        carro1.setPlaca("jdk-0001");
        carro1.setCor("azul");
        carro1.setAno(2013);
        carro1.setFabricante("volkswagem");
        totalCarros ++;

        Carro carro2 = new Carro();

        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1);
        cliente1.setCpf("12345678-90");
        cliente1.setNome("Rodrigo Barros");
        cliente1.setCnh("XYZ0001");

        Cliente cliente2 = new Cliente();
        gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));

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


    public static void gerarRelatorioLocacao (Carro carro1, LocalDate ...datas){
        float totalFaturado = 2 * 99.9f;
    }



}
