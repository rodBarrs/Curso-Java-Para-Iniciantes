package Desafios.DesafiosAula0410;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio02 {

    public static void main(String[] args) {

        String emailRegex = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+";
        String email = JOptionPane.showInputDialog("Digite o email: ");

        Pattern patterns = Pattern.compile(emailRegex);
        Matcher matcher = patterns.matcher(email);

        if (matcher.matches()) {
            JOptionPane.showMessageDialog(null,"email válido");
        } else {
            JOptionPane.showMessageDialog(null,"Email não é válido");
        }

    }

}
