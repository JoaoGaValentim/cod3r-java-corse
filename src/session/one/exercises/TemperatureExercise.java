package session.one.exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TemperatureExercise {
    public static void main(String[] args) {
        /**
         * Criar um programa que leia a temperatura em Fahrenheit e converta para
         * Celsius.
         */

        final var temperatureFahrenheit = Double
                .valueOf(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit: "));
        final var FACTOR_FAH = 5.0 / 9.0;
        final var temperaturaCelsius = (temperatureFahrenheit - 32.0) * FACTOR_FAH;

        final var message = String.format("""
                (%.2f °F − 32) × %.2f = %.2f °C
                """, temperatureFahrenheit, FACTOR_FAH, temperaturaCelsius);

        JOptionPane.showMessageDialog(null, message, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
