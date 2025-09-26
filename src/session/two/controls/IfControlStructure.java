package session.two.controls;

import java.util.Scanner;

public class IfControlStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        var age = sc.nextInt();

        System.out.println("idade: " + age);

        var isLegalAge = age >= 18;
        var isChildren = age >= 5 && age <= 10;
        var isTeen = age >= 11 && age <= 17;

        if (isLegalAge) {
            System.out.println("Você é maior de idade.");
        }

        if (isChildren) {
            System.out.println("Você é uma criança.");
        }

        if (isTeen) {
            System.out.println("Você é um adolescente.");
        }

        sc.close();
    }
}
