package session.seven.universe.components;

import java.util.List;

public class Galaxy {
    private final double size;
    private final List<CelestialBody> celestialBodies;
    private final Universe universe;
    private final double age;
    private final String name;

    public Galaxy() {
        this(null, 0, 0.0, null, null);
    }

    public Galaxy(String name, double age, double size, List<CelestialBody> celestialBodies, Universe universe) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.celestialBodies = celestialBodies;
        this.universe = universe;
    }

    public void addCelestialBody(CelestialBody celestialBody) {
        celestialBodies.add(celestialBody);
    }

    public double getSize() {
        return size;
    }

    public List<CelestialBody> getCelestialBodies() {
        return celestialBodies;
    }

    public Universe getUniverse() {
        return universe;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
