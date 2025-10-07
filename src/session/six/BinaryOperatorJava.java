package session.six;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorJava {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (AVAMention, testMention) -> (AVAMention * 0.4) + (testMention * 0.6);

        Function<Double, String> getAverageStatus = averageUNIVESP -> {
            var message = "você tirou " + averageUNIVESP;
            return averageUNIVESP >= 5.0 ? message + " e foi aprovado" : message + " e foi reprovado";
        };

        System.out.println(average.andThen(getAverageStatus).apply(9.73, 10.0));
    }
}
