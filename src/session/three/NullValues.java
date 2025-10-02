package session.three;

public class NullValues {
    public static void main(String[] args) {
        String content = ""; // ✅ variável válida
        System.out.println(content.concat("!!!!"));

        Date date = Math.random() > 0.5 ? new Date() : null;

        if (date instanceof Date) {
            date.printDate();
        }

        // String quote = null;
        // System.out.println(quote.concat("!!!")); // erro de execução
    }
}
