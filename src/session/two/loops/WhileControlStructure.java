package session.two;

import java.util.Scanner;

public class WhileControlStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        System.out.println("Quantas vezes devo repetir a saudação?");
        int maxValue = sc.nextInt();

        while (counter <= maxValue) {
            System.out.printf("Bom dia %d!\n", counter);
            counter++;
        }

        sc.close();
    }
}
