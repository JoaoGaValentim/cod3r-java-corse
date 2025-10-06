package session.five.abstractoo.biology;

import java.util.ArrayList;

public class Dog extends Mammal {
    public Dog(String name, String description, ArrayList<String> habitats) {
        super(name, description, "Canis lupos", false, true, null, habitats, "Mammal");
    }

    public Dog(String name, String description, String scientificName, boolean inIntinction, boolean isDomesticable,
            ArrayList<String> families, ArrayList<String> habitats, String category) {
        super(name, description, scientificName, inIntinction, isDomesticable, families, habitats, category);
    }

    @Override
    public String fed() {
        return "Mamando leite nas tetas da mamãe cão";
    }
}
