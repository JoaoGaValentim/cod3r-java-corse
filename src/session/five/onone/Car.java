package session.five.onone;

public class Car {
    final Engine engine;

    Car() {
        engine = new Engine();
    }

    void turnOnCar() {
        engine.engineIsOn = true;
    }

    void turnOffCar() {
        engine.engineIsOn = false;
    }

    void accelerate() {
        engine.injectionFactor += 0.4;
    }

    void breakCar() {
        if (engine.injectionFactor > 0.5) {
            engine.injectionFactor -= 0.4;
        }
    }

    boolean carIsTurnOn() {
        return engine.engineIsOn;
    }
}
