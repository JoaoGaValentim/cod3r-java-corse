package session.one;

public class ParserValues {
	public static void main(String[] args) {
		var value = "73";
		// Integer.parseInt(value);
		Double valueDouble = Integer.valueOf(value) * 2.3;

		System.out.println(valueDouble.toString());
	}
}
