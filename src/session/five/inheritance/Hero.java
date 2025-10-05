package session.five.inheritance;

public class Hero extends Player {

    Hero(double positionX, double positionY) {
        super(positionX, positionY);
    }

    @Override
    boolean attack(Player opponent) {
        boolean firstAttack = super.attack(opponent);
        boolean lastAttack = super.attack(opponent);
        boolean attackSuccess = firstAttack || lastAttack;
        return attackSuccess;
    }
}
