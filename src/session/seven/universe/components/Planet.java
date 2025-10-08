package session.seven.universe.components;

import java.util.List;

public class Planet extends CelestialBody {
    private final List<String> matters;
    private final boolean isHabitable;
    private final Galaxy galaxy;
    private final List<CelestialBody> satellites;
    private double sumDistance;

    public Planet() {
        this(null, 0, 0, 0, 0, null, false, null, null);
    }

    public Planet(String name, double age, double distance, double orbitSize, double lightPower, List<String> matters,
            boolean isHabitable,
            Galaxy galaxy, List<CelestialBody> satellites) {
        super(name, age, distance, orbitSize, lightPower);
        this.matters = matters;
        this.isHabitable = isHabitable;
        this.galaxy = galaxy;
        this.satellites = satellites;
    }

    public List<String> getMatters() {
        return matters;
    }

    public boolean isHabitablePlanet() {
        return isHabitable;
    }

    public List<CelestialBody> getSatellites() {
        return satellites;
    }

    public Galaxy getGalaxy() {
        return galaxy;
    }

    public Planet addDistance(double value) {
        this.sumDistance += value;
        return this;
    }

    public double getDistanceSum() {
        return sumDistance;
    }

    public static Planet combiner(Planet fPlanet, Planet lPlanet) {
        Planet planet = new Planet();
        planet.sumDistance += fPlanet.getDistanceSum() + lPlanet.getDistanceSum();
        return planet;
    }
}
