package session.nine;

import session.nine.models.NumericBoxDouble;

public class BoxIntegerTest {
    public static void main(String[] args) {
        NumericBoxDouble studentsBoxDouble = new NumericBoxDouble();

        for (int i = 0; i < 10; i++) {
            studentsBoxDouble.add(10 * Math.random());
        }

        studentsBoxDouble.forEachInBox(System.out::println);
        System.out.println(studentsBoxDouble.average());
    }
}
