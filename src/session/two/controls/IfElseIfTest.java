package session.two.controls;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Forneça o nome do dia da semana: ");
        String dayOfWeekName = sc.nextLine();

        if (dayOfWeekName.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        }

        if (dayOfWeekName.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        }

        if (dayOfWeekName.equalsIgnoreCase("Terça")) {
            System.out.println(3);
        }

        if (dayOfWeekName.equalsIgnoreCase("Quarta")) {
            System.out.println(4);
        }

        if (dayOfWeekName.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        }

        if (dayOfWeekName.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        }

        if (dayOfWeekName.equalsIgnoreCase("Sábado")) {
            System.out.println(7);
        }

        sc.close();
    }
}
