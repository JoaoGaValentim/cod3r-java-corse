package session.five.abstractoo.biology;

import java.util.ArrayList;

abstract public class Mammal extends Animal {
     protected final String category;

     public Mammal(String name, String description, String scientificName, boolean inIntinction,
               boolean isDomesticable,
               ArrayList<String> families,
               ArrayList<String> habitats, String category) {

          super(name, description, scientificName, inIntinction, isDomesticable, families, habitats);
          this.category = category;
     }

     public abstract String fed();

     @Override
     public final void move() {
          System.out.println("Movendo...");
     }
}
