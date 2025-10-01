package session.three;

public class CircleArea {
    double radio;
    static final double PI = 3.141592;

    CircleArea(double initialRadio) {
        radio = initialRadio;
    }

    double area() {
        return PI * Math.pow(radio, 2);
    }

    static double area(double radio) {
        return PI * radio;
    }
}
