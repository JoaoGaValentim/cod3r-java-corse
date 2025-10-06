package session.six;

@FunctionalInterface
public interface Calcule {
    double calculate(double firstValue, double lastValue, Operations operation);

    default String operationType(String operation) {
        return operation;
    }
}
