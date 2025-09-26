package session.two.controls;

import javax.swing.JOptionPane;

public class IfElseControlStructure {
    public static void main(String[] args) {
        int number = Integer.valueOf(JOptionPane.showInputDialog("Informe um número."));
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Número par.");
        } else {
            JOptionPane.showMessageDialog(null, "Número impar.");
        }
    }
}
