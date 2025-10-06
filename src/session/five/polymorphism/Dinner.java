package session.five.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Dinner {
    public static void main(String[] args) {
        People people = new People(88.55);
        Food iceCream = new IceCream(0.2);
        Food bean = new Bean(0.5);
        Food rice = new Rice(0.2);

        var foods = new ArrayList<Food>();

        System.out.println(people.getWeight());

        foods.add(rice);
        foods.add(bean);
        foods.add(iceCream);

        for (int i = 0; i < 10; i++) {
            foods.add(bean);
        }

        for (Food food : foods) {
            people.eat(food);
        }

        System.out.println(people.getWeight());
    }
}
