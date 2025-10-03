package session.four.collections;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("João"));
        users.add(new User("Clara"));
        users.add(new User("Lucas"));
        users.add(new User("Eloah"));

        System.out.println(users.get(1).name);
        System.out.println(users.toString());
        // remove pelo hashCode
        System.out.println(users.remove(new User("Eloah")));
        System.out.println(users.contains(new User("Lucas")));

        for (User user : users) {
            System.out.println(user);
        }
    }
}
