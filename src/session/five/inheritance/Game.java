package session.five.inheritance;

public class Game {
    public static void main(String[] args) {
        Player hero = new Hero(0.0, 0.0);
        Player monster = new Monster();

        hero.positionX = 10;
        hero.positionY = 10;

        monster.positionX = 10;
        monster.positionY = 11;

        System.out.println(monster.attack(hero));
        System.out.println(hero.attack(monster));
        System.out.println(hero.attack(monster));

        System.out.println("Hero life => " + hero.life);
        System.out.println("Monster life => " + monster.life);
    }
}
