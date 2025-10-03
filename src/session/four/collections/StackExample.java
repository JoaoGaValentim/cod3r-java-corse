package session.four.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<String> programmingLanguages = new ArrayDeque<>();

        programmingLanguages.add("C++"); // true or false
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("Rust");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.push("COBOL"); // play exception

        System.out.println(programmingLanguages.size());
        System.out.println(programmingLanguages.isEmpty());
        System.out.println(programmingLanguages.contains("C#"));

        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }

        // System.err.println(programmingLanguages.pop()); // play exception
        System.err.println(programmingLanguages.peek());
        System.err.println(programmingLanguages.poll());
        System.err.println(programmingLanguages.poll());
        System.err.println(programmingLanguages.poll());
        System.err.println(programmingLanguages.poll());
        System.err.println(programmingLanguages.poll());
        System.err.println(programmingLanguages.poll());
        // System.err.println(programmingLanguages.remove()); // play exception

        programmingLanguages.clear();
    }
}
