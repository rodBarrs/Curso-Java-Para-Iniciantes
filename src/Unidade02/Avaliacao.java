package Unidade02;

import javax.swing.*;

public class Avaliacao {

    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));

        if (nota < 0 || nota > 100){
            JOptionPane.showMessageDialog(null,"Nota inválida! Digitar nota no intervalo de 0 a 100");
            main(null);
        } else if ( nota < 50){
            JOptionPane.showMessageDialog(null,"Conceito insuficiente");
        } else if ( nota < 70) {
            JOptionPane.showMessageDialog(null,"Conceito Regular");
        } else if (nota < 90) {
            JOptionPane.showMessageDialog(null,"Conceito Bom");
        } else {
            JOptionPane.showMessageDialog(null,"Conceito Excelente");

        }

    }
}
