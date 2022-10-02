package Unidade02;

import javax.swing.*;

public class AplicacaoExpoente {
    public static void main(String[] args) {

        double e = 0;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));

        for (int y = 1; y <=50; y++){
            e = e + (Math.pow(x,y)/y);
        }
        JOptionPane.showMessageDialog(null,"Valor de e(x): "+ e);
    }
}
