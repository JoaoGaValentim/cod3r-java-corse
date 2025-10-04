package session.five.manytomany;

public class ManyToManyTest {
    public static void main(String[] args) {
        Student studentOne = new Student("João");
        Student studentTwo = new Student("Clara");

        var courseJava = new Course("Java");
        var coursePython = new Course("Python");

        studentOne.addCourse(coursePython);
        studentTwo.addCourse(coursePython);
        studentTwo.addCourse(courseJava);

        for (Student student : courseJava.students) {
            System.out.println("Curso de " + courseJava.name);
            System.out.println(student);
        }

        for (Student student : coursePython.students) {
            System.out.println("Curso de " + coursePython.name);
            System.out.println(student);
        }
    }
}
