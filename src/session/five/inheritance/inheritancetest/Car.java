package session.five.inheritance.inheritancetest;

public class Car {
    double actualSpeed;
    boolean carIsOn;
    boolean isBreak;

    Car() {
        this(false);
    }

    Car(boolean carIsOn) {
        this.carIsOn = carIsOn;
        this.isBreak = false;
    }

    void turnOnCar() {
        carIsOn = true;
    }

    void turnOffCar() {
        carIsOn = false;
        isBreak = true;
        actualSpeed = 0.0;
    }

    double accelerate() {
        if (actualSpeed == 0.0 && !carIsOn || isBreak) {
            return actualSpeed;
        }

        if (carIsOn && !isBreak || actualSpeed == 0.0) {
            actualSpeed += 5.0;
        }

        return actualSpeed;
    }

    void breakCar() {
        if (actualSpeed > 0 && !isBreak) {
            actualSpeed -= 5.0;
        }

        if (actualSpeed == 0) {
            isBreak = true;
        }
    }
}
