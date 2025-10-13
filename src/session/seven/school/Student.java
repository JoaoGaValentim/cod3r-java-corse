package session.seven.school;

import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final List<Double> points;

    public Student(String name, List<Double> points) {
        this.name = name;
        this.points = points;
    }

    public double average() {
        return points.stream()
                .filter(Objects::nonNull)
                .mapToDouble(Number::doubleValue)
                .average().orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public List<Double> getPoints() {
        return points;
    }
}
