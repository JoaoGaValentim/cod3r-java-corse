package session.five.inheritance.inheritancetest;

public class Ferrari extends Car {

    Ferrari() {
        super(false, 310);
    }

    Ferrari(boolean carIsOn, double MAX_VELOCITY) {
        super(carIsOn, MAX_VELOCITY);
    }

    @Override
    double accelerate() {
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
    void breakCar() {
        if (actualSpeed > 0 && !isBreak) {
            actualSpeed -= 15.0;
        }

        if (actualSpeed == 0) {
            isBreak = true;
        }
    }
}
