package session.two.exercises;

import javax.swing.JOptionPane;

public class SumWhileExercise {
    public static void main(String[] args) {
        int counter = 0;
        boolean isCalculateInLoop = true;
        while (isCalculateInLoop) {
            int value = Integer.valueOf(JOptionPane.showInputDialog("Informe um número inteiro positivo: "));
            counter += value;
            if (value < 0) {
                isCalculateInLoop = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Soma total = " + counter);
    }
}
