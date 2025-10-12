package session.eight;

public class ExceptionOfException {
    public static void main(String[] args) {
        try {
            firstMethod(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }

        firstMethod(null);
    }

    static void firstMethod(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Favor informar um nome válido.");
        }

        System.out.println("Olá, " + name + "!");
    }

    static void lastMethod(String name) {
        try {
            firstMethod(name);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
