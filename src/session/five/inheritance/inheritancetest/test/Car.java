package session.five.inheritance.inheritancetest.test;

public class Car {
    public final double MAX_VELOCITY;
    protected double delta = 5.0; // protected visível nas classes filhas
    protected double actualSpeed;
    protected boolean carIsOn;
    protected boolean isBreak;

    protected Car(boolean carIsOn, double MAX_VELOCITY) {
        this.carIsOn = carIsOn;
        this.isBreak = false;
        this.MAX_VELOCITY = MAX_VELOCITY;
    }

    public void turnOnCar() {
        carIsOn = true;
    }

    public void turnOffCar() {
        carIsOn = false;
        isBreak = true;
        actualSpeed = 0.0;
    }

    public double accelerate() {
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

    public void breakCar() {
        if (actualSpeed > 0 && !isBreak) {
            actualSpeed -= 5.0;
        }

        if (actualSpeed == 0) {
            isBreak = true;
        }
    }

    public double getActualSpeed() {
        return actualSpeed;
    }

    public String getCarStatus() {
        return carIsOn ? "ligado" : "desligado";
    }
}
