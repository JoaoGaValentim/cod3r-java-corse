package session.two.exercises;

import javax.swing.JOptionPane;

public class PrimeNumberExercise {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        boolean isPrime = true;

        switch (number) {
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, number + " é primo.");
                break;
            default:
                if (number % 2 == 0) {
                    isPrime = false;
                }

                for (int i = 3; i < Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
                break;
        }

        if (isPrime) {
            JOptionPane.showMessageDialog(null, number + " é primo.");
        }

        if (!isPrime) {
            JOptionPane.showMessageDialog(null, number + " não é primo.");
        }
    }
}
