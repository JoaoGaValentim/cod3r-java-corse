package session.two.exercises;

import javax.swing.JOptionPane;

public class PrimeCheckerExercise {
    public static void main(String[] args) {
        int totalDivisions = 0;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (number >= 1 && number <= 2) {
            JOptionPane.showMessageDialog(null, number + " é primo.");
            return;
        }

        for (int i = 3; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                totalDivisions++;
            }
        }

        if (totalDivisions == 0) {
            JOptionPane.showMessageDialog(null, number + " é primo.");
        }

        if (totalDivisions > 0) {
            JOptionPane.showMessageDialog(null, number + " não é primo.");
        }
    }
}
