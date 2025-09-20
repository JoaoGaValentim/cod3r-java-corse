package session.one.exercises;

import java.util.Scanner;

public class BhaskaraExercise {
    public static void main(String[] args) {
        /**
         * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
         * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
         * Encontre o delta
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("ax2: ");
        final var ax2 = sc.nextDouble();

        System.out.println("bx: ");
        final var bx = sc.nextDouble();

        System.out.println("c: ");
        final var c = sc.nextDouble();

        final var delta = Math.pow(bx, 2) - 4 * ax2 * c;
        System.out.printf("delta = %.2f %n", delta);

        var resultBhaskara = (-bx + Math.sqrt(delta)) / 2 * ax2;
        System.out.printf("x' = %.2f %n", resultBhaskara);

        resultBhaskara = (-bx - Math.sqrt(delta)) / 2 * ax2;
        System.out.printf("x'' = %.2f %n", resultBhaskara);

        sc.close();
    }
}
