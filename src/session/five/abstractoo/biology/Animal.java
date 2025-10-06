package session.five.abstractoo.biology;

import java.util.ArrayList;

abstract public class Animal {
    protected final String name;
    protected final String scientificName;
    protected final String description;
    protected final boolean isInstinct;
    protected final boolean isDomesticable;
    protected final ArrayList<String> families;
    protected final ArrayList<String> habitats;

    public Animal() {
        this(null, null, null, false, false, null, null);
    }

    public Animal(String name, String description, String scientificName, boolean inIntinction,
            boolean isDomesticable,
            ArrayList<String> families,
            ArrayList<String> habitats) {
        this.name = name;
        this.description = description;
        this.scientificName = scientificName;
        this.isInstinct = inIntinction;
        this.isDomesticable = isDomesticable;
        this.families = families;
        this.habitats = habitats;
    }

    public boolean isDomesticable() {
        return isDomesticable;
    }

    public boolean isInstinct() {
        return isInstinct;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public ArrayList<String> getFamilies() {
        return families;
    }

    public ArrayList<String> getHabitats() {
        return habitats;
    }

    public void move() {
        System.out.println("Movendo....");
    }
}
