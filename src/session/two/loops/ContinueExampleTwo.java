package session.two;

public class ContinueExampleTwo {
    public static void main(String[] args) {
        extern: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%s %s]", i, j);

                if (i == 2) {
                    continue extern;
                }
            }
        }
        System.out.println();
    }
}
