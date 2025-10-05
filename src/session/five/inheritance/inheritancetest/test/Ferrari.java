package session.five.inheritance.inheritancetest.test;

import session.five.inheritance.inheritancetest.Lux;
import session.five.inheritance.inheritancetest.Sportive;

public class Ferrari extends Car implements Sportive, Lux {

    private boolean superSpeedIsOn;
    private boolean doorsIsOpen;

    public void setDoorsIsOpen() {
        this.doorsIsOpen = true;
    }

    public Ferrari() {
        super(false, 310);
    }

    public Ferrari(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
        delta = 15;
    }

    @Override
    public double accelerate() {
        if (actualSpeed == 0.0 && !carIsOn || isBreak) {
            return actualSpeed;
        }

        if (actualSpeed + getDelta() > MAX_VELOCITY) {
            actualSpeed = MAX_VELOCITY;
        }

        if (carIsOn && !isBreak || actualSpeed == 0.0) {
            actualSpeed += getDelta();
        }

        return actualSpeed;
    }

    @Override
    public void breakCar() {
        if (actualSpeed > 0 && !isBreak) {
            actualSpeed -= 15.0;
        }

        if (actualSpeed == 0) {
            isBreak = true;
        }
    }

    @Override
    public double getActualSpeed() {
        return actualSpeed;
    }

    @Override
    public void onSuperSpeed() {
        superSpeedIsOn = true;
    }

    @Override
    public void offSuperSpeed() {
        superSpeedIsOn = false;
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
        double delta = 15;
        if (superSpeedIsOn && !doorsIsOpen) {
            delta = 35;
        }

        if (doorsIsOpen) {
            turnOffCar();
            return 0.0;
        }

        return delta;
    }
}
