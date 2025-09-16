package session.one;

import java.util.Locale;
import java.util.Scanner;

public class SalaryAverage {
	public static void main(String[] args) {
		Locale.setDefault(Locale.getDefault());
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o salário de Janeiro: ");
		var janSalary = sc.nextDouble();
		System.out.println("Informe o salário de Fevereiro: ");
		var febSalary = sc.nextDouble();
		System.out.println("Informe o salário de Março: ");
		var marSalary = sc.nextDouble();

		Double average = (janSalary + febSalary + marSalary) / 3.0;

		System.out.printf("Média salarial é %.2f", average);
		sc.close();
	}
}
 