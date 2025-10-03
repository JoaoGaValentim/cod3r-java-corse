package session.four.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();

        users.add(new User("João"));
        users.add(new User("Clara"));
        users.add(new User("Pedro"));
        users.add(new User("Lucas"));

        boolean userExists = users.contains(new User("João"));
        System.out.println(userExists);
    }
}
