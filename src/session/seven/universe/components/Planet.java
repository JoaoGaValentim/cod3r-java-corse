package session.seven.universe.components;

import java.util.List;

public class Planet extends CelestialBody {
    private final List<String> matters;
    private final boolean isHabitable;
    private final Galaxy galaxy;
    private final List<CelestialBody> satellites;

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
}
