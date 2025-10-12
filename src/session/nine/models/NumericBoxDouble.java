package session.nine.models;

import java.util.ArrayList;
import java.util.List;

import session.nine.interfaces.Box;

public class NumericBoxDouble implements Box<Double> {
    private final List<Double> numbers = new ArrayList<>();
    private int total;

    @Override
    public int getTotalThings() {
        return total;
    }

    public void add(Double i) {
        numbers.add(i);
        total++;
    }

    public int get(Double t) {
        return numbers.indexOf(t);
    }

    public Double getValue(int i) {
        return numbers.get(i) != null ? numbers.get(i) : -1;
    }

    public boolean open() {
        return true;
    }

    public List<Double> getAll() {
        return numbers;
    }

    public Double sum() {
        double result = 0;

        for (Double value : getAll()) {
            result += value;
        }

        return result;
    }

    public double average() {
        return sum() / getAll().size();
    }
}
