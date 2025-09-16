package session.one;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
//		String message = "Hello, World!";
//
//		System.out.println(message); // quebra a linha
//		System.out.print(message + "\n"); // uma linha
//
//		System.out.printf("%.3f %n", 73F);
//		System.out.printf("%s %n", message);

		Scanner sc = new Scanner(System.in);

		System.out.println("Seu nome completo: ");
		var name = sc.nextLine();
		var splitedName = name.split(" ");

		System.out.printf("Tamanho do seu nome: %s %n", name.length());
		System.out.printf("O %s tem %s nome(s) %n", name, splitedName.length);

		sc.close();
	}

}
