package session.four.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.random.RandomGenerator;

public class OrderSet {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>(); // <> operador diamond
        // Não se acessa pelo index
        SortedSet<String> names = new TreeSet<>(); // ordena na ordem de insert

        names.add("João");
        names.add("Clara");
        names.add("Lucas");
        names.add("Eloah");

        System.out.println(names);

        // names.forEach(name -> System.out.println(name));
        for (String name : names) {
            System.out.println(name);
        }

        Set<Double> numbers = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(RandomGenerator.getDefault().nextDouble(1, 100));
        }

        for (Double number : numbers) {
            System.out.printf("%.2f\n", number);
        }
    }
}
