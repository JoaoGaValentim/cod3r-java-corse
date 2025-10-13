package session.nine.boxes;

import java.util.random.RandomGenerator;

import session.nine.boxes.models.NumericBox;

public class BoxIntegerTest {
    public static void main(String[] args) {

        NumericBox<Integer> eBox = new NumericBox<>();

        for (int i = 0; i < 100; i++) {
            eBox.add(RandomGenerator.getDefault().nextInt(1100));
        }

        System.out.println(eBox.sum());

        eBox.forEachInBox(System.out::println);

        // Box<Integer> aBox = new NumericBox<>();
    }
}
