package session.five.polymorphism;

public class Dinner {
    public static void main(String[] args) {
        People people = new People(88.55);
        IceCream iceCream = new IceCream(0.2);
        Bean bean = new Bean(0.5);
        Rice rice = new Rice(0.2);

        System.out.println(people.getWeight());

        people.eat(bean);
        people.eat(rice);
        people.eat(iceCream);

        System.out.println(people.getWeight());
    }
}
