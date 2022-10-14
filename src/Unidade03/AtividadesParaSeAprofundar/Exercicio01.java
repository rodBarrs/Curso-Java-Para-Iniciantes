package Unidade03.AtividadesParaSeAprofundar;

import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {

        String frase1 = "O curso de Java";
        String frase2 = "é ótimo!";
        String fraseCompleta = frase1 + " "+ frase2;
        JOptionPane.showMessageDialog(null,  fraseCompleta);

        String java = fraseCompleta.substring(10,15);
        JOptionPane.showMessageDialog(null,  java);


    }
}
