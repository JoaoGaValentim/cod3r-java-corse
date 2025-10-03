package session.three;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        User admin = new User();
        admin.name = "João";
        admin.email = "joao@email.com";

        User manager = new User();
        manager.name = "João";
        manager.email = "joao@email.com";

        System.out.println(admin == manager);
        System.out.println(admin.equals(manager));
        System.out.println(manager.equals(admin));

        System.out.println(admin.equals(new Object()));
    }
}
