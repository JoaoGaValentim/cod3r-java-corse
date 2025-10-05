package session.five.inheritance;

import session.five.inheritance.test.Hero;
import session.five.inheritance.test.Monster;
import session.five.inheritance.test.Player;

public class Game {
    public static void main(String[] args) {
        Player hero = new Hero(10.0, 0.0);
        Player monster = new Monster(11.0, 0.0);

        System.out.println(monster.attack(hero));
        System.out.println(hero.attack(monster));
        System.out.println(hero.attack(monster));
        System.out.println(hero.attack(monster));

        hero.name = "Michel";
        monster.name = "Devil";

        System.out.println("Hero " + hero.name + " life => " + hero.getLife());
        System.out.println("Monster " + monster.name + " life => " + monster.getLife());
    }
}
