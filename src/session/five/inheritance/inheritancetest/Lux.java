package session.five.inheritance.inheritancetest;

public interface Lux {
    void openDoors();

    void startGPS();

    default int airSpeed() {
        return 1;
    }
}
