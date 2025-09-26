package session.two;

public class MoreAboutForPartThreeControlStructure {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%s %s]", i, j);
            }
            System.err.println();
        }
    }
}
