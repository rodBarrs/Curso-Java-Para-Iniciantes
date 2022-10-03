package Unidade02.AtividadesParaAprofundar;

import javax.swing.*;

public class Exercicio01 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null,"Fatorial de "+ n+": "+fatorial);
    }
}
