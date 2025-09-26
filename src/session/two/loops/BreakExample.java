package session.two.loops;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

            if (i == 9) {
                System.out.println("Fim.");
                break;
            }
        }
    }
}
