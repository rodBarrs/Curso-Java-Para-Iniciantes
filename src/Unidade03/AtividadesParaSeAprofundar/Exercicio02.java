package Unidade03.AtividadesParaSeAprofundar;

import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {

        String data = JOptionPane.showInputDialog("Informe a data: ");
        String[] termos = data.split("/");

        System.out.println("dia: "+termos[0]+
                "\nMês: "+ termos[1]+
                "\nAno: "+ termos[2]);

    }
}
