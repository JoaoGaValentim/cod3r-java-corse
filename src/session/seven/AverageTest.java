package session.seven;

public class AverageTest {
    public static void main(String[] args) {
        Average fAverage = new Average().add(3.0).add(7.0);
        Average lAverage = new Average().add(3.0).add(7.0);

        System.out.println(Average.combine(fAverage, lAverage).getTotal());
    }
}
