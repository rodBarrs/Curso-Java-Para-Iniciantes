package Unidade02.AtividadesParaAprofundar;

import javax.swing.*;

public class Exercicio04 {


    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B: "));
        int soma = 0;
        if(A <= B){
            for (int i = A; i <= B; i++){
                soma += i;
            }
        } else {
            for (int i = B; i <= A; i++){
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null,"Soma: "+ soma);
    }

}
