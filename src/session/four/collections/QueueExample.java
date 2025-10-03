package session.four.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> namesQueue = new LinkedList<>();

        namesQueue.add("Clara"); // play exception
        namesQueue.offer("João"); // return true or false
        namesQueue.offer("Lucas");
        namesQueue.add("Tobias");

        System.out.println(namesQueue.peek()); // return null
        System.out.println(namesQueue.element()); // play exception

        System.out.println(namesQueue.isEmpty()); // true or false
        System.out.println(namesQueue.poll()); // return null
        System.out.println(namesQueue.remove()); // play exception

        System.out.println(namesQueue.toString());
    }
}
