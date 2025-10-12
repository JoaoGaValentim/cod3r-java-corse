package session.nine.models;

import java.util.ArrayList;
import java.util.List;

import session.nine.interfaces.Box;

public class NumericBox<T extends Number> implements Box<T> {
    private final List<T> numbers = new ArrayList<>();
    private int total = 0;

    public void add(T thing) {
        numbers.add(thing);
        total++;
    }

    public int getTotalThings() {
        return total;
    }

    public int getBoxIndex(T t) {
        return numbers.indexOf(t);
    }

    public T getValue(int i) {
        return numbers.get(i) != null ? numbers.get(i) : null;
    }

    public List<T> getAll() {
        return numbers;
    }

    public double sum() {
        double result = 0.0;

        for (T t : numbers) {
            if (t != null) {
                result += t.doubleValue();
            }
        }

        return result;
    }

}
