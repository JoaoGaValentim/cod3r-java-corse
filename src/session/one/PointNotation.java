package session.one;

public class PointNotation {
	public static void main(String[] args) {
		// Tipos primitivos não tem o operador ".",
		// eles só tem o próprio valor.
		String name = "João";
		name = name.replace('ã', 'a').toUpperCase().concat("THEODORO").indent(1).intern();
		System.out.println(name);
	}
}
