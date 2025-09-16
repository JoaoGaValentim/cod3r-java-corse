package session.one.variables;

public class Inference {
	public static void main(String[] args) {
		// Infere o tipo pelo valor
		// Nunca será sobrescrito o tipo
		var name = "João";
		System.out.println(name);

		var age = 24;
		System.out.println(age);

		var height = 1.80;

		System.out.println(height);

		final var PI = 3.1415;
		System.out.println(PI);
	}
}
