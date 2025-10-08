package session.seven;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72);

        Function<Integer, Integer> odds = v -> (2 * v) + 1;
        Predicate<Integer> threeMultiplicationTable = v -> v % 3 == 0;
        BinaryOperator<Integer> sum = (acc, n) -> acc + n;

        String binarySumResult = numbers.stream()
                .map(odds)
                .filter(threeMultiplicationTable)
                .reduce(sum)
                .map(Integer::toBinaryString)
                .get();

        numbers.stream()
                .map(v -> Math.sqrt((6 * v) + 1))
                .reduce((acc, n) -> acc % Math.sqrt(n) != 0 ? n : acc)
                .ifPresent(System.out::println);

        System.out.println(binarySumResult.equals(null));
        System.out.println(binarySumResult.isEmpty());
        System.out.println(binarySumResult);
        System.out.println(Integer.parseInt(binarySumResult, 2));
    }
}
