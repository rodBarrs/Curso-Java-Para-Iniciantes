package Unidade02.AtividadesParaAprofundar;

import javax.swing.*;

public class Exercicio03 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
        double harmonico = 1;

        for (int i = 2; i <= n; i++){
            harmonico += 1 / n;
        }
        JOptionPane.showMessageDialog(null,"Harmonico de "+ n+": "+ harmonico);

    }

}
