package session.seven.universe.components;

public abstract class CelestialBody extends Galaxy {
    private final String name;
    private final double age;
    private final double distance;
    private final double orbitSize;
    private final double lightPower;

    public CelestialBody(String name, double age, double distance, double orbitSize, double lightPower) {
        this.name = name;
        this.age = age;
        this.distance = distance;
        this.orbitSize = orbitSize;
        this.lightPower = lightPower;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getOrbitSize() {
        return orbitSize;
    }

    public double getLightPower() {
        return lightPower;
    }

    public double getAge() {
        return age;
    }
}
