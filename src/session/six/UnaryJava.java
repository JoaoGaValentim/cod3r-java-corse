package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import session.one.operators.UnaryOperators;

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
