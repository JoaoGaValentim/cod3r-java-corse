package session.one.variables;

public class StringType {
	public static void main(String[] args) {
		// String é um tipo imutável
		String name = "João Gabriel Valentim Theodoro";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.startsWith("J"));
		System.out.println(name.equals(name));
		// ignora upper e lower
		System.out.println(name.toLowerCase().equalsIgnoreCase(name));
		// você não modificou, só fez substitução
		name = name.toUpperCase();
		System.out.println(name);

		var nameCity = "Gotham";
		System.out.println(nameCity.trim());

		// formatando string e variáveis
		String message = String.format("Meu nome é %s e a cidade do meu herói favorito é %s.", name, nameCity);

		System.out.println(message);
		System.out.println(message.substring(75));
		System.out.println(message.indexOf(nameCity));
		System.out.println(message.contains(nameCity));

		StringBuilder builder = new StringBuilder();
		builder.append(nameCity, 0, 3); // pegar as 3 primeiras letras
		System.out.println(builder);
	}
}
