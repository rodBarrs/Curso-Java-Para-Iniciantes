package Unidade02;

import javax.swing.*;

public class AplicacaoMedia {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor: "));
        int media = 0, soma = 0;
        int maior, menor;
        menor = maior = valor;
        int numeros = 0;

        while (valor != -1){
            soma += valor;
            numeros++;
            if (valor > maior)
                maior = valor;
            else if (valor < menor)
                menor = valor;
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor: "));
        }

        media = soma/numeros;
        JOptionPane.showMessageDialog(null,"Maior: "+maior);
        JOptionPane.showMessageDialog(null,"Menor:"+menor);
        JOptionPane.showMessageDialog(null,"Media: "+media);


    }
}
