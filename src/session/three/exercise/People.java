package session.three.exercise;

public class People {
    String name;
    double weight;

    People() {
        this(null, 0.0);
    }

    People(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void sneak(Food food) {
        if (!(food instanceof Food)) {
            System.out.println("Sem comida... Vou ficar magro :/");
        }

        if (food instanceof Food) {
            System.out.println(name + " está comendo " + food.name + "...");
            weight += food.weight;
        }
    }

    void printPeople() {
        System.out.println();
        System.out.println("NOME= " + name);
        System.out.println("PESO= " + weight);

        if (weight >= 90.0 && weight < 100) {
            System.out.println(name + " está ficando gordo!");
        }

        if (weight >= 100) {
            System.out.println(name + " está gordão!");
        }

        System.out.println();
    }
}
