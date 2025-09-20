package session.one.exercises;

import javax.swing.JOptionPane;

public class TemperatureExerciseTwo {
    public static void main(String[] args) {
        /**
         * Criar um programa que leia a temperatura em Celsius e converta para
         * Fahrenheit.
         */

        final var temperaturaCelsius = Double
                .valueOf(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));
        final var FACTOR_CEL = 9.0 / 5.0;
        final var temperatureFahrenheit = (temperaturaCelsius * FACTOR_CEL) + 32.0;

        final var message = String.format("""
                (%.2f °C × %.2f) + 32 = %.2f °F
                """, temperaturaCelsius, FACTOR_CEL, temperatureFahrenheit);

        JOptionPane.showMessageDialog(null, message, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
