package session.seven.universe.components;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    private final double size;
    private final List<Planet> planets;
    private final Universe universe;
    private final double age;
    private final String name;

    public Galaxy() {
        this(null, 0, 0.0, null, null);
    }

    public Galaxy(String name, double age, double size, List<Planet> planets, Universe universe) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.planets = planets == null ? new ArrayList<>() : planets;
        this.universe = universe;
    }

    public void addPlanets(List<Planet> planetsList) {
        planets.addAll(planetsList);
    }

    public double getSize() {
        return size;
    }

    public List<Planet> getPlanets() {
        return planets;
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
