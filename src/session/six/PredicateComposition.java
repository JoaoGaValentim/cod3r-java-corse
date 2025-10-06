package session.six;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isNumberOdd = value -> value % 2 == 1 ? true : false;
        Predicate<Integer> isThreeDigitNumber = value -> value >= 100 && value <= 999 ? true : false;

        // System.err.println(isThreeDigitNumber.and(isNumberOdd).test(137));
        // System.err.println(isThreeDigitNumber.and(isNumberOdd).test(122));
        // System.err.println(isThreeDigitNumber.and(isNumberOdd).test(773));

        for (int i = 0; i <= 1000; i++) {
            boolean isThreeDigitOddNumberTest = isThreeDigitNumber.and(isNumberOdd).test(i);
            if (isThreeDigitOddNumberTest) {
                System.out.println(i + " é impar e tem 3 dígitos.");
            }
        }
    }
}
