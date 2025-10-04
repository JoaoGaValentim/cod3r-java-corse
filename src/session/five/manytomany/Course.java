package session.five.manytomany;

import java.util.ArrayList;

public class Course {
    final String name;
    final ArrayList<Student> students = new ArrayList<>();

    Course() {
        this(null);
    }

    Course(String name) {
        this.name = name;
    }

    ArrayList<Student> getStudents() {
        return this.students;
    }
}
