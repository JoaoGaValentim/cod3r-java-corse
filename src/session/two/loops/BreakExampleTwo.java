package session.two.loops;

public class BreakExampleTwo {
    public static void main(String[] args) {
        extern: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%s %s]", i, j);

                if (i == 2) {
                    break extern;
                }
            }
        }
        System.out.println();
    }
}
