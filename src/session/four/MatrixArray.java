package session.four;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de alunos da sala: ");
        int studentsTotalInClass = sc.nextInt(); // linhas

        System.out.println("Quantas notas tem cada aluno? ");
        int mentionsTotalPerStudent = sc.nextInt(); // colunas

        double[][] studentsMention = new double[studentsTotalInClass][mentionsTotalPerStudent];
        double total = 0.0;

        for (int i = 0; i < studentsMention.length; i++) { // i -> rows
            for (int j = 0; j < studentsMention[i].length; j++) { // j -> columns
                System.out.println("Informe a " + (j + 1) + " nota do aluno " + (i + 1) + ":");
                studentsMention[i][j] = sc.nextDouble();
                total += studentsMention[i][j];
            }
        }

        final double average = total / studentsMention.length;

        System.out.printf("Média da turma = %.2f\n", average);

        sc.close();
    }
}
