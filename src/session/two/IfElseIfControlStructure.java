package session.two;

import java.util.Scanner;

public class IfElseIfControlStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma nota: ");
        double point = sc.nextDouble();

        // particularmente eu prefiro adotar a prática da filosofia
        // "no-else", evitando uso do else ao máximo,
        // mas como intuito de aprendizagem:
        if (point > 10 || point < 0) {
            System.out.println("Nota inválida");
        } else if (point <= 10 && point >= 9.7) {
            System.out.println("Conceito A+");
        } else if (point <= 9.6 && point >= 9.3) {
            System.out.println("Conceito A");
        } else if (point <= 9.2 && point >= 9.0) {
            System.out.println("Conceito A-");
        } else if (point <= 8.9 && point >= 8.7) {
            System.out.println("Conceito B+");
        } else if (point <= 8.6 && point >= 8.3) {
            System.out.println("Conceito B");
        } else if (point <= 8.2 && point >= 8.0) {
            System.out.println("Conceito B-");
        } else if (point <= 7.9 && point >= 7.7) {
            System.out.println("Conceito C+");
        } else if (point <= 7.6 && point >= 7.3) {
            System.out.println("Conceito C");
        } else if (point <= 7.2 && point >= 7.0) {
            System.out.println("Conceito C-");
        } else if (point <= 6.9 && point >= 6.7) {
            System.out.println("Conceito E+");
        } else if (point <= 6.6 && point >= 6.3) {
            System.out.println("Conceito E");
        } else if (point <= 6.2 && point >= 4.0) {
            System.out.println("Conceito E-");
        } else {
            System.out.println("Conceito F");
        }

        sc.close();
    }
}
