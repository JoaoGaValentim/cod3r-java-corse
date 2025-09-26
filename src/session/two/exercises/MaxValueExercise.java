package session.two.exercises;

import java.util.Scanner;

public class MaxValueExercise {
    public static void main(String[] args) {
        int maxValue = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o valor de " + (i + 1));
            int value = sc.nextInt();

            if (maxValue < value) {
                maxValue = value;
            }
        }

        System.out.println("Maior valor é " + maxValue);

        sc.close();
    }
}
