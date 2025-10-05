package session.five.inheritance.inheritancetest.test;

import session.five.inheritance.inheritancetest.Lux;

public class Civic extends Car implements Lux {

    private boolean doorsIsOpen;

    public Civic() {
        super(false, 250);
        delta = 5;
    }

    public Civic(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
    }

    public boolean isDoorsOpen() {
        return doorsIsOpen;
    }

    @Override
    public void openDoors() {
        System.out.println("Open doors...");
        doorsIsOpen = true;
    }

    @Override
    public void startGPS() {
        System.out.println("Starting GPS...");
    }

    @Override
    public double getDelta() {
        if (doorsIsOpen) {
            turnOffCar();
            return 0.0;
        }
        return delta;
    }
}
