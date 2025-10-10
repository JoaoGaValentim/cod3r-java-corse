package session.eight;

public class CheckedUnchecked {
    public static void main(String[] args) {
        try {
            generateError();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } // trato se eu quiser

        try {
            generateErrorTwo();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim. ");
    }

    // não checada/ não verificada
    static void generateError() throws RuntimeException {
        // algo que pode ser lançado (throw)
        throw new RuntimeException("Erro legal #1");
    }

    // deixar claro quando ela for checada
    static void generateErrorTwo() throws Exception {
        throw new Exception("Erro legal #2");
    }
}
