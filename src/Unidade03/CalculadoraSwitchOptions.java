package Unidade03;

import javax.swing.*;

public class CalculadoraSwitchOptions {

    public static void main(String[] args) {

        String operacoes[] = {"Adicao", "Subtracao","Multiplicação","Divisão"};
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Número 1: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: "));

        Object opcao = JOptionPane.showInputDialog(null,"Escolha a operação","Calculadora",
                JOptionPane.QUESTION_MESSAGE,null,operacoes,"");

        JOptionPane.showMessageDialog(null, switch ((String) opcao) {

            case "Adicao" -> numero1 + numero2;
            case "Subtracao" -> numero1 - numero2;
            case "Multiplicação" -> numero1 * numero2;
            case "Divisão" -> (double)numero1 / numero2;
            default -> "Erro";
        });

        }


    }