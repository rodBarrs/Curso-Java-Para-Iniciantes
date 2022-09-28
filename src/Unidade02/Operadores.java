package Unidade02;

import javax.swing.*;

public class Operadores {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));


        int adicao = numero1 + numero2;
        int subtracao = numero1 - numero2;
        double divisao = (double)numero1/numero2;
        int multiplicacao = numero1 * numero2;
        boolean numero1MaiorNumero2 = numero1 > numero2;
        boolean numero1igualNumero2 = numero1 == numero2;
        boolean numero1MenorNumero2 = numero1 < numero2;

        JOptionPane.showMessageDialog(null,"Adição: " + adicao);
        JOptionPane.showMessageDialog(null,"Subtração: " + subtracao);
        JOptionPane.showMessageDialog(null,"Divisão: " + divisao);
        JOptionPane.showMessageDialog(null,"Multiplicação: " + multiplicacao);
        JOptionPane.showMessageDialog(null,"Numero 1 maior que numero 2: " + numero1MaiorNumero2);
        JOptionPane.showMessageDialog(null,"Numero 1 igual numero 2: " + numero1igualNumero2);
        JOptionPane.showMessageDialog(null,"Numero 1 menor que numero 2: " + numero1MenorNumero2);




    }
}
