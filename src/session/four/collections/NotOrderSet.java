package session.four.collections;

import java.util.HashSet;
import java.util.Set;

public class NotOrderSet {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(1.2);
        hashSet.add(true);
        hashSet.add("Hello");

        hashSet.add("1");
        hashSet.add(1);

        System.out.println(hashSet.toString());
        System.out.println(hashSet.size());

        System.out.println(hashSet.remove(1));
        System.out.println(hashSet.contains("Hello"));
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(false));

        Set numbersA = new HashSet<>();
        Set numbersB = new HashSet<>();

        numbersA.add(1);
        numbersA.add(2);
        numbersA.add(3);
        numbersA.add(4);

        numbersB.add(5);
        numbersB.add(3);
        numbersB.add(7);
        numbersB.add(8);

        // numbersA.addAll(numbersB); // união (U)

        System.out.println(numbersA.toString());

        numbersB.retainAll(numbersA);
        System.out.println(numbersB.toString());
    }
}
