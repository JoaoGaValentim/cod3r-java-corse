package session.six;

public class Sum implements Calcule {
    public double calculate(double firstValue, double lastValue, Operations operations) {
        return firstValue + lastValue;
    }
}
