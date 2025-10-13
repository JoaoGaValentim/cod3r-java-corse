package session.seven.school;

import java.util.Arrays;
import java.util.List;

public class TestClasses {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("João", Arrays.asList(10.0, 10.0, 10.0, 10.0)),
                new Student("Clara", Arrays.asList(10.0, 10.0, 7.0, 8.0)));

        Classroom classroom = new Classroom(students, "4A");

        System.out.println(classroom.computeClassRoomAverage());
    }
}
