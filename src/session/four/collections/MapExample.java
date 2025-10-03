package session.four.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        // sorted with insert order
        // MNap is more flexible
        Map<String, Object> user = new LinkedHashMap<>();

        user.put("name", "João");
        user.put("name", "João"); // duplicate
        user.put("email", "joao@email.com");
        user.put("loggedTime", 2.3);

        user.remove("loggedTime"); // return value
        System.out.println(user.remove("password")); // return null

        // for (String key : user.keySet()) {
        // System.out.println(key);
        // }

        // for (Object value : user.entrySet()) {
        // System.out.println(value);
        // }

        for (Entry<String, Object> register : user.entrySet()) {
            System.out.print(register.getKey() + " ===> ");
            System.out.println(register.getValue());
        }
    }
}
