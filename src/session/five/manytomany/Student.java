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
        return name;
    }

    Course getCourseByName(String name) {
        for (Course course : courses) {
            if (course.name.equalsIgnoreCase(name)) {
                return course;
            }
        }

        return null;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }
}
