package session.one;

import java.util.Scanner;

public class StringTypeEquals {
    public static void main(String[] args) {
        String name = "João Gabriel";
        String lastName = "Theodoro";

        System.out.println(name.equals(lastName)); // false
        System.out.println(!name.equals(lastName)); // true (not)

        System.out.println("2".equals("2")); // true

        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine().trim(); // remover espaços
        String secondString = sc.nextLine().trim();

        // o sc.next() remove os espaços em branco

        System.out.println(firstString.equals(secondString));
        sc.close();
    }
}
