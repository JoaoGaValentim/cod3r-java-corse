package session.nine.models;

import java.util.ArrayList;
import java.util.List;

import session.nine.interfaces.Box;

public class NumericBoxInt implements Box<Integer> {
    private final List<Integer> numbers = new ArrayList<>();
    private int total;

    public void add(Integer i) {
        numbers.add(i);
        total++;
    }

    public int getTotalThings() {
        return total;
    }

    public Integer getValue(int i) {
        return numbers.get(i) != null ? numbers.get(i) : -1;
    }

    public List<Integer> getAll() {
        return numbers;
    }

    public int get(Integer t) {
        return numbers.indexOf(t);
    }

    public boolean open() {
        return true;
    }

    public Integer sum() {
        int result = 0;

        for (Integer value : getAll()) {
            result += value;
        }

        return result;
    }
}
