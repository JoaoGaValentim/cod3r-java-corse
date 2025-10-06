package session.five.abstractoo;

import java.util.ArrayList;

import session.five.abstractoo.biology.Dog;
import session.five.abstractoo.biology.Mammal;

public class AbstractTest {
    public static void main(String[] args) {
        ArrayList<String> habitats = new ArrayList<>();

        habitats.add("Casa");
        habitats.add("Florestas");
        habitats.add("Canil");

        Mammal dog = new Dog("Scooby", "Cão legal", habitats);

        System.out.println(dog.getName());
        System.out.println(dog.getDescription());
        System.out.println(dog.getScientificName());
        System.out.println(dog.isDomesticable() ? "Domável" : "Selvagem");
        System.out.println(dog.isInstinct());
        System.out.println(dog.getHabitats().toString());

        System.out.println(dog.fed());
    }
}
