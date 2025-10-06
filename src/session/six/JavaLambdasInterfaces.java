package session.six;

import java.util.function.BinaryOperator;

public class JavaLambdasInterfaces {
    public static void main(String[] args) {
        BinaryOperator<Double> calcule = (x, y) -> x * y;
        System.out.println(calcule.apply(12.0, 2.2));

        BinaryOperator<Integer> otherCalcule = (x, y) -> x * y;
        System.out.println(otherCalcule.apply(12, 2));
    }
}
