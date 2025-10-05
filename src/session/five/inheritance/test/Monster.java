package session.five.inheritance.test;

import java.util.random.RandomGenerator;

public class Monster extends Player {

    public Monster(double positionX, double positionY) {
        super(positionX, positionY);
        super.id = id = RandomGenerator.getDefault().nextInt(1, 1000);
        System.out.println("Monstro com id => 0x" + id);
    }

    @Override
    public boolean attack(Player opponent) {
        return super.attack(opponent);
    }
}
