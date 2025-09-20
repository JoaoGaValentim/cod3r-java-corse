package session.one.exercises;

import javax.swing.JOptionPane;

public class BmiExercise {
    public static void main(String[] args) {
        /**
         * Criar um programa que leia o peso e a altura do usuário e imprima no console
         * o IMC.
         */

        final var height = Double
                .valueOf(JOptionPane.showInputDialog("Informe sua altura em CM: "));
        final var weight = Double
                .valueOf(JOptionPane.showInputDialog("Informe seu peso em Kg: "));

        final var heightInMeters = height / 100.0;

        final var bmiResult = weight / Math.pow(heightInMeters, heightInMeters);

        var status = bmiResult <= 18.4 ? "Abaixo do peso" : bmiResult;
        status = bmiResult >= 18.5 && bmiResult <= 24.9 ? "Normal" : status;
        status = bmiResult >= 25.0 && bmiResult <= 39.9 ? "Sobrepeso" : status;
        status = bmiResult >= 40.0 ? "Obeso" : status;

        var message = String.format("""
                    IMC = %.2f
                    STATUS = %s
                """, bmiResult, status);

        JOptionPane.showMessageDialog(null, message, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
