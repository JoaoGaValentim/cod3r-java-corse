package session.one;

public class PrimitivesAndObjects {
	public static void main(String[] args) {
		// primitivo, sem acesso a notação ".",
		// só carregando os valores
		int size = 73;
		// Objeto com acesso a notação "."
		// Wrappers de primitivos
		Integer age = 73;

		System.out.println(size);
		System.out.println(Integer.reverse(age));
	}
}
