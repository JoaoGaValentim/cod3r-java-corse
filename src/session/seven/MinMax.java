package session.seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("João", 10.0),
                new Student("Maria", 9.5),
                new Student("Pedro", 8.7),
                new Student("Ana", 7.8),
                new Student("Lucas", 6.9),
                new Student("Beatriz", 8.2),
                new Student("Carlos", 7.5),
                new Student("Fernanda", 9.1),
                new Student("Rafael", 6.8),
                new Student("Juliana", 8.9),
                new Student("Gabriel", 7.2),
                new Student("Larissa", 9.0),
                new Student("Bruno", 8.3),
                new Student("Camila", 7.7),
                new Student("Felipe", 6.5),
                new Student("Patricia", 8.6),
                new Student("Gustavo", 7.9),
                new Student("Aline", 9.3),
                new Student("Renato", 8.1),
                new Student("Sabrina", 7.4),
                new Student("Eduardo", 6.7),
                new Student("Vanessa", 8.8),
                new Student("Thiago", 7.6),
                new Student("Isabela", 9.2),
                new Student("Rodrigo", 8.0),
                new Student("Tatiane", 7.3),
                new Student("Leonardo", 6.6),
                new Student("Monique", 8.5),
                new Student("André", 7.1),
                new Student("Simone", 9.4),
                new Student("Vinicius", 8.4),
                new Student("Paula", 7.0),
                new Student("Marcos", 6.4),
                new Student("Carolina", 8.7),
                new Student("Diego", 7.8),
                new Student("Leticia", 9.1),
                new Student("Alex", 8.2),
                new Student("Cristina", 7.5),
                new Student("Fábio", 6.9),
                new Student("Elaine", 8.0),
                new Student("Roberto", 7.2));

        Comparator<Student> compare = (fStudent, lStudent) -> {
            if (fStudent.getAverage() > lStudent.getAverage())
                return 1; // first is greeter then last
            if (fStudent.getAverage() < lStudent.getAverage())
                return -1; // last is greeter then first
            return 0; // same average
        };

        System.out.println("Aluno com a menor nota => " + students
                .stream()
                .min(compare)
                .get().getName());

        System.out.println("Aluno com nota mais alta => " + students
                .stream()
                .max(compare)
                .get().getName());
    }
}
