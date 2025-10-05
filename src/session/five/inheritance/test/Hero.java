package session.five.inheritance.test;

import java.util.random.RandomGenerator;

public class Hero extends Player {

    public Hero(double positionX, double positionY) {
        super(positionX, positionY);
        super.id = id = RandomGenerator.getDefault().nextInt(1, 1000);
        System.out.println("Herói com id => 0x" + super.id);
    }

    @Override
    public boolean attack(Player opponent) {
        boolean firstAttack = super.attack(opponent);
        boolean lastAttack = super.attack(opponent);
        boolean attackSuccess = firstAttack || lastAttack;
        return attackSuccess;
    }
}
