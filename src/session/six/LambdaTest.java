package session.six;

public class LambdaTest {
    public static void main(String[] args) {
        Calcule calcule = (firstValue, lastValue, operation) -> {
            var result = 0.0;

            if (operation.equals(Operations.SUM)) {
                result = firstValue + lastValue;
            }

            if (operation.equals(Operations.SUBTRACT)) {
                result = firstValue - lastValue;
            }

            if (operation.equals(Operations.MULTIPLY)) {
                result = firstValue * lastValue;
            }

            if (operation.equals(Operations.DIVISION)) {
                result = firstValue / lastValue;
            }

            return result;
        };

        System.out.println(calcule.calculate(2, 7, Operations.MULTIPLY));
        System.out.println(calcule.calculate(2, 7, Operations.SUM));
        System.out.println(calcule.calculate(2, 7, Operations.DIVISION));
        System.out.println(calcule.calculate(2, 7, Operations.SUBTRACT));

    }
}
