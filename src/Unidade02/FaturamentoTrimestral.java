package Unidade02;

import javax.swing.*;

public class FaturamentoTrimestral {

    public static void main(String[] args) {

        double faturamentoJaneiro = Double.parseDouble(JOptionPane.showInputDialog("Faturamento de Janeiro: "));
        double faturamentoFevereiro = Double.parseDouble(JOptionPane.showInputDialog("Faturamento de Fevereiro: "));
        double faturamentoMarco = Double.parseDouble(JOptionPane.showInputDialog("Faturamento de Março: "));

        double faturamentoTrimestral = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;

        JOptionPane.showMessageDialog(null,"Faturamento trimestral: "+ faturamentoTrimestral);

    }
}
