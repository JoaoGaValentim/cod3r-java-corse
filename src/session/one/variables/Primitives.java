package session.one.variables;

public class Primitives {
	public static void main(String[] args) {
		// existem 8 tipos
		// - 6 para números
		// - float
		// - double
		// - long
		// - short
		// - int
		// - byte (menor deles)

		// Tipos inteiros
		byte yearsYork = 31;
		short totalFlights = 500;
		int id = 211;
		long totalPoints = 4_000_222_333L; // literal long (termina em L)

		// Tipos reais
		double price = 2_444_232.33;
		float height = 1.80F;

		// 2 tipos não numéricos
		// - boolean (true, false)
		// - char ('a', 'b' e '1')
		// tipo bool
		boolean isActive = true;
		// tipo caracter
		char closeWindow = 'Y';

		System.out.println(yearsYork * 365);
		System.out.println(totalFlights / 2);
		System.out.println(id);
		System.out.println(totalPoints / 2);
		System.out.println(price);
		System.out.println(height);
		System.out.println(isActive);
		System.out.println(closeWindow);
	}
}
