package Unidade02.AtividadesParaAprofundar;

import javax.swing.*;
import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        final byte n = 4, n_vet = n * n;
        int[][] matriz = new int[n][n];
        int[] vet_aux = new int[n_vet];
        int cont = 0;

        String message = "Matriz: \n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, cont++) {
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o valor da matriz["+i+"]["+j+"]"));
                message += "["+matriz[i][j] + "]  ";
                vet_aux[cont] = matriz[i][j];
            }
            message += "\n";
        }
        message += "Valores:\n";
        Arrays.sort(vet_aux);

        cont = 1;
        for (int i = 0; i < n_vet - 1; i++) {
            if (vet_aux[i] != vet_aux[i + 1]) {
                message += vet_aux[i] + ": " + cont + "\n";
                cont = 0;
                if (i + 1 == n_vet - 1)
                    message += vet_aux[i + 1] + ": " + 1 + "\n";
            } else if (i + 1 == n_vet - 1)
                message += vet_aux[i] + ": " + (cont + 1) + "\n";

            cont++;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}
