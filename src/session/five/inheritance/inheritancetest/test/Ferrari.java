package session.five.inheritance.inheritancetest.test;

public class Ferrari extends Car {
    public Ferrari() {
        super(false, 310);
    }

    public Ferrari(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
    }

    @Override
    public double accelerate() {
        if (actualSpeed == 0.0 && !carIsOn || isBreak) {
            return actualSpeed;
        }

        if (actualSpeed + delta > MAX_VELOCITY) {
            actualSpeed = MAX_VELOCITY;
        }

        if (carIsOn && !isBreak || actualSpeed == 0.0) {
            actualSpeed += 15.0;
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
}
