package session.two.loops;

import java.util.Scanner;

public class WhileControlStructureTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudents = 10;
        int counter = 1;
        double totalAveragesSum = 0.0;

        while (counter <= totalStudents) {
            System.out.println("Média do do aluno " + counter + ":");
            double studentAverage = sc.nextDouble();

            if (studentAverage <= 10 || studentAverage >= 0) {
                totalAveragesSum += studentAverage;
                counter++;
            } else if (studentAverage != -1) {
                System.out.println("Nota inválida");
            }
        }

        double average = totalAveragesSum / totalStudents;

        System.out.println("Média da sala = " + average);
        sc.close();
    }
}
