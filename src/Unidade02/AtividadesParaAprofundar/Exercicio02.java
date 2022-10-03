package Unidade02.AtividadesParaAprofundar;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        int matriz [][] = new int[4][4];
        int vetor [] = new int [12];
        boolean vrificador;
        for (int i =0; i <=4; i++){
            for (int j = 0; j<=4; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

            }
        }

        for (int i =0; i <=4; i++){
            for (int j = 0; j<=4; j++){
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }

    }
}
