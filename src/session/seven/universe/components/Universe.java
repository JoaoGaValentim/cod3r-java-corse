package session.seven.universe.components;

import java.util.List;

public class Universe {
    private final String dimensionalCode;
    private final double age;
    private List<Galaxy> galaxies;

    public Universe() {
        this(null, 0.0);
    }

    public Universe(String dimensionalCode, double age) {
        this.dimensionalCode = dimensionalCode;
        this.age = age;
    }

    public List<Galaxy> getGalaxies() {
        return galaxies;
    }

    public String getDimensionalCode() {
        return dimensionalCode;
    }

    public double getAge() {
        return age;
    }
}
