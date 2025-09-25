package session.two;

import java.util.Scanner;

public class MoreAboutWhileControlStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = "";

        while (!value.equalsIgnoreCase("exit")) {
            System.out.println("Entrada: ");
            value = sc.nextLine();
        }

        sc.close();
    }
}
