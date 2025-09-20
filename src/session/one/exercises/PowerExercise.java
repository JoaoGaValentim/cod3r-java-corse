package session.one.exercises;

import java.util.Scanner;

public class PowerExercise {
    public static void main(String[] args) {
        /**
         * Criar um programa que leia um valor e apresente os resultados ao quadrado e
         * ao cubo do valor.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        final var number = sc.nextDouble();

        final var resultSquare = Math.pow(number, 2);
        final var resultCube = Math.pow(number, 3);

        System.out.printf("%.2fˆ2 = %.2f %n", number, resultSquare);
        System.out.printf("%.2fˆ3 = %.2f %n", number, resultCube);

        sc.close();
    }
}
