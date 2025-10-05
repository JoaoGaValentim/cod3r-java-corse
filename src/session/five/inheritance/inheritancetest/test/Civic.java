package session.five.inheritance.inheritancetest.test;

public class Civic extends Car {
    public Civic() {
        super(false, 250);
    }

    public Civic(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
    }
}
