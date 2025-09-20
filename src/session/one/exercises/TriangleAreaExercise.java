package session.one.exercises;

import javax.swing.JOptionPane;

public class TriangleAreaExercise {
    public static void main(String[] args) {
        /**
         * Criar um programa que leia o valor da base e da altura de um triângulo e
         * calcule a área.
         */

        final var base = Double
                .valueOf(JOptionPane.showInputDialog("Informe o valor da base do triângulo: "));
        final var height = Double
                .valueOf(JOptionPane.showInputDialog("Informe sua altura do triângulo: "));

        final var area = (base * height) / 2.0;

        var message = String.format("""
                    A = (%.2f B * %.2f H) / 2
                    A = %.2f
                """, base, height, area);

        JOptionPane.showMessageDialog(null, message, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
