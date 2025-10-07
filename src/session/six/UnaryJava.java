package session.six;

import java.util.function.UnaryOperator;

public class UnaryJava {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = number -> (int) Math.pow(number, 2);
        UnaryOperator<Integer> doubleSquare = value -> value * 2;
        UnaryOperator<Integer> divisionToTwo = value -> value / 2;

        int result = square.compose(doubleSquare)
                .compose(divisionToTwo).apply(233);

        System.out.println(result);
    }
}
