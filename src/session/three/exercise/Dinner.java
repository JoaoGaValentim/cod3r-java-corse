package session.three.exercise;

public class Dinner {
    public static void main(String[] args) {
        Food[] foods = {
                new Food("Arroz", 1.2),
                new Food("Feijão", 3.2),
                new Food("Sopa", 5.2),
                new Food("Chocolate", 1.3),
                new Food("Paçoca", 4.1),
                new Food("Pão", 11.1)
        };
        People people = new People("João", 88.5);

        for (Food food : foods) {
            people.eat(food);
        }

        people.printPeople();
    }
}
