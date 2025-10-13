package session.nine.mathlist;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Double> fats = MathematicList.fats(numbers);
        double sum = MathematicList.sum(numbers);
        double sumMany = MathematicList.sumMany(Arrays.asList(numbers, numbers));

        System.out.println(fats);
        System.out.println(sum);
        System.out.println(sumMany);

        System.out.println(sum + sumMany);

        numbers = Arrays.asList(1, 2, 3, 1);
        System.out.println(MathematicList.sumDistinct(numbers));
        System.out.println(MathematicList.sumManyDistinct(Arrays.asList(numbers, List.of(10, 11, 11))));

        numbers = Arrays.asList(10, 10, 10); // 10
        var otherStudent = Arrays.asList(10, 10, 9, 9); // 9,5

        System.out.println(MathematicList.averageDoubleLists(numbers, otherStudent));
    }
}
