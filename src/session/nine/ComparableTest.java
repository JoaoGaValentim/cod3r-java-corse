package session.nine;

import java.util.TreeSet;

public class ComparableTest {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        for (Integer integer : numbers) {
            System.out.println(integer);
        }
    }
}
