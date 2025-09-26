package session.two.loops;

public class ForControlStructure {
    public static void main(String[] args) {
        // for (; true;) {
        // System.out.println(1);
        // } for infinito

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                continue; // continua sem assumir valores pares
            }

            System.out.println(i);
        }

    }
}
