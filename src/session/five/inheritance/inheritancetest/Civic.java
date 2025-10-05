package session.five.inheritance.inheritancetest;

public class Civic extends Car {
    Civic() {
        super(false, 250);
    }

    Civic(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
    }
}
