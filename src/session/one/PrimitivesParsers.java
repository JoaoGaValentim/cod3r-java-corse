package session.one;

public class PrimitivesParsers {
	public static void main(String[] args) {
		int totalDaysInOneYear = 365;
		// casting
		double totalDays = (double) totalDaysInOneYear * 2025;
		System.out.printf("%f", totalDays * 24);
	}
}
