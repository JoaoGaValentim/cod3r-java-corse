package session.three;

public class CircleAreaTest {
    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea(5.6);
        CircleArea circleAreaPiscine = new CircleArea(11.3);

        System.out.println(CircleArea.PI);
        System.out.println(circleArea.area());
        System.out.println(circleAreaPiscine.area());
        System.out.println(CircleArea.area(200));
    }
}
