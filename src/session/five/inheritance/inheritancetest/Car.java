package session.five.inheritance.inheritancetest;

public class Car {
    final double MAX_VELOCITY;
    double delta = 5.0;
    double actualSpeed;
    boolean carIsOn;
    boolean isBreak;

    Car(boolean carIsOn, double MAX_VELOCITY) {
        this.carIsOn = carIsOn;
        this.isBreak = false;
        this.MAX_VELOCITY = MAX_VELOCITY;
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

        if (actualSpeed + delta > MAX_VELOCITY) {
            actualSpeed = MAX_VELOCITY;
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
