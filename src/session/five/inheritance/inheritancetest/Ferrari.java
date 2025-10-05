package session.five.inheritance.inheritancetest;

public class Ferrari extends Car {
    @Override
    double accelerate() {
        if (actualSpeed == 0.0 && !carIsOn || isBreak) {
            return actualSpeed;
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
