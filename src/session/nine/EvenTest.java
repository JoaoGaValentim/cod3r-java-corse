package session.nine;

public class EvenTest {
    public static void main(String[] args) {
        Evens<Double, String> ranking = new Evens<>();

        ranking.add(1.0, "João");
        ranking.add(2.0, "Clara");
        ranking.add(3.0, "Lucas");

        try {
            System.out.println(ranking.getValue(1.0));
            System.out.println(ranking.getValue(2.0));
            System.out.println(ranking.getValue(3.0));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
