package session.nine.mathlist;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(
                1, 2, 3, 5,
                6, 7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24);
        List<Integer> otherNumbers = List.of(1, 1, 1, 2, 3, 4);

        System.out.println(MathematicCollection.fats(numbers));
        System.out.println(MathematicCollection.extractEvens(numbers));
        System.out.println(MathematicCollection.extractOdds(numbers));
        System.out.println(MathematicCollection.noRepeatList(otherNumbers));

        List<Double> noRepeatNumbersList = MathematicCollection.noRepeatList(otherNumbers);

        System.out.println(MathematicCollection.sum(noRepeatNumbersList));
        System.out.println(MathematicCollection.sum(otherNumbers));
        System.out.println(MathematicCollection.average(List.of(10, 8, 10, 10)));

        System.out.println(MathematicCollection.toBinaryList(numbers));

        System.out.println(MathematicCollection.max(List.of(1, 2, 3, 11, 200)));
        System.out.println(MathematicCollection.min(List.of(1, 2, 3, 11, 200)));
        System.out.println(MathematicCollection.sumDoubleLists(List.of(200, 500), List.of(11, 200)));
        System.out.println(MathematicCollection.averageDoubleLists(List.of(200, 500), List.of(11, 200)));
    }
}
