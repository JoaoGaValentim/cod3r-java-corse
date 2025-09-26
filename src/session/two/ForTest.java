package session.two;

public class ForTest {
    public static void main(String[] args) {
        for (String value = "#"; !value.equals("######"); value += "#") {
            System.out.println(value);
        }
    }
}