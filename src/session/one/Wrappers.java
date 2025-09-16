package session.one;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Byte byteValue = 32;
		Short shortValue = 255;
		Integer intValue = sc.nextInt();
		Long longValue = 1_000_000_000_000_000_000L;
		Float floatValue = 1000_000_000_000_000F;
		Double doubleValue = 1000_000_000.1;

		Boolean isActive = Boolean.parseBoolean("true");
		String name = "João";
		Character charValue = '@';

		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);

		System.out.println(isActive);
		System.out.println(name);
		System.out.println(charValue);

		sc.close();
	}
}
