package session.two.exercises;

import javax.swing.JOptionPane;

public class VerifyNumberInInterval {
    public static void main(String[] args) {
        var number = Integer.valueOf(JOptionPane.showInputDialog("informe um número:"));
        var message = "";

        if (number >= 0 && number <= 10) {
            message += "O valor " + number + " se encontra entre 0 e 10. \n";
        }

        if (number % 2 == 0) {
            message += "É um número par.";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
