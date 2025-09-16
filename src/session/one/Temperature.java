package session.one;

public class Temperature {
	public static void main(String[] args) {
		double temperature = 32;
		// DGR_CONSTS
		final double DEGREE_C_FACTOR = 1.8;
		// use . para casa após a virgola
		final double DEGREE_F_FACTOR = (5.0 / 9.0);
		// DGR_C = (C * 1.8) + 32
		double tempratureFahrenheit = (temperature * DEGREE_C_FACTOR) + 32;
		// DGR_F = (F - 32) * 5/9
		double temperatureCelcius = (tempratureFahrenheit - 32) * DEGREE_F_FACTOR;
		System.out.println("°F = " + tempratureFahrenheit);
		System.out.println("°C = " + temperatureCelcius);
	}
}