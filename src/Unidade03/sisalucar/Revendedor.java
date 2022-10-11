package Unidade03.sisalucar;

public enum Revendedor {

    ABCVEICULOS("101010/0111","Rua das Perdizes, 1500", "Volkswagem"),
    SIMAOVEICULOS("010101/0001","Av. morumbi 2500","Honda"),
    EMANUELVEICULOS("1111/0001","Av das nações 100","Toyota");

    String cnpj;
    String endereco;
    String fabricantes;

    Revendedor(String cnpj, String endereco, String fabricantes) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.fabricantes = fabricantes;
    }
}
