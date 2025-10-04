package session.five.manytomany;

import java.util.ArrayList;

public class Student {
    final String name;
    final ArrayList<Course> courses = new ArrayList<>();

    Student() {
        this(null);
    }

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }
}
