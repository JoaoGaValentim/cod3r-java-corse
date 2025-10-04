package session.five.onone;

public class Engine {
    final Car car = null;
    boolean engineIsOn;
    double injectionFactor = 1;

    Engine() {
        this(false);
    }

    Engine(boolean engineIsOn) {
        this.engineIsOn = engineIsOn;
    }

    int turn() {
        if (!engineIsOn) {
            return 0;
        }

        return (int) Math.round(injectionFactor * 3000);
    }
}
