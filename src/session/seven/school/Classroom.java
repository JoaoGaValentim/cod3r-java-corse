package session.seven.school;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Classroom {
    private final List<Student> students;
    private final String doorId;

    public Classroom(List<Student> students, String doorId) {
        this.students = students;
        this.doorId = doorId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getDoorId() {
        return doorId;
    }

    public double computeClassRoomAverage() {
        List<Double> nonNullStudentsPoint = students.stream().map(Student::average).filter(Objects::nonNull)
                .collect(Collectors.toList());
        return nonNullStudentsPoint.stream().mapToDouble(Number::doubleValue)
                .average().orElse(0.0);
    }
}
