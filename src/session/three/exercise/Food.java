package session.three.exercise;

public class Food {
    String name;
    double weight;

    Food() {
        this(null, 0.0);
    }

    Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void printFood() {
        System.out.println();
        System.out.println("NOME= " + name);
        System.out.println("PESO= " + weight);
        System.out.println();
    }
}
