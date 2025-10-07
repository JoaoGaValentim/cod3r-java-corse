package session.seven.universe;

import java.util.Arrays;
import java.util.List;
import session.seven.universe.components.Galaxy;
import session.seven.universe.components.Planet;
import session.seven.universe.components.Universe;

public class SpaceShip {
    public static void main(String[] args) {
        Universe universe = new Universe("c-137", 15_000_000_000.0);
        Galaxy galaxy = new Galaxy("Andromeda", 200, 2000000, null, universe);

        List<Planet> planets = Arrays.asList(
                new Planet("Mercúrio", 3.3e23, 57.9e6, 88.0, 1, Arrays.asList("ferro"), false, galaxy, null),
                new Planet("Vênus", 4.87e24, 108.2e6, 225.0, 0, Arrays.asList("dióxido de carbono"), false, galaxy,
                        null),
                new Planet("Terra", 5.97e24, 149.6e6, 365.2, 1, Arrays.asList("oxigênio", "água"), true, galaxy, null),
                new Planet("Marte", 6.42e23, 227.9e6, 687.0, 2, Arrays.asList("ferro", "dióxido de carbono"), false,
                        galaxy, null),
                new Planet("Júpiter", 1.90e27, 778.3e6, 4331.0, 79, Arrays.asList("hidrogênio", "hélio"), false, galaxy,
                        null),
                new Planet("Saturno", 5.68e26, 1_427.0e6, 10747.0, 82, Arrays.asList("hidrogênio", "hélio"), false,
                        galaxy, null),
                new Planet("Urano", 8.68e25, 2_871.0e6, 30589.0, 27, Arrays.asList("hidrogênio", "hélio", "metano"),
                        false, galaxy, null),
                new Planet("Netuno", 1.02e26, 4_498.0e6, 59800.0, 14, Arrays.asList("hidrogênio", "hélio", "metano"),
                        false, galaxy, null));

        planets
                .stream()
                .filter(planet -> planet.getAge() > 3.3e23 && planet.getDistance() > 149.6e6)
                .map(planet -> String.format("""
                            Nome: %s
                            DM: %s
                            GLX: %s
                        """, planet.getName(), planet.getGalaxy().getUniverse().getDimensionalCode(),
                        planet.getGalaxy().getName()))
                .forEach(System.out::println);

    }
}
