package Unidade02;

import javax.swing.*;

public class AplicacaoFibonacci {

    public static void main(String[] args) {

        int anterior1 = 1;
        int anterior2 = 1;
        int calculado = anterior1 + anterior2;
        int soma = anterior1 + anterior2+calculado;
        JOptionPane.showMessageDialog(null,anterior1 + ","+anterior2+","+calculado);


        for (int i = 4; i<=20; i++){
            anterior1 = anterior2;
            anterior2 = calculado;
            calculado =anterior1 + anterior2;
            soma += calculado;
            JOptionPane.showMessageDialog(null,calculado+";");
        }

        double media = soma/20;
        JOptionPane.showMessageDialog(null,"Média: "+ media);

    }
}
