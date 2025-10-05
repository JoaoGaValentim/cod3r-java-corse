package session.five.inheritance;

public class Hero extends Player {
    @Override
    boolean attack(Player opponent) {
        boolean firstAttack = super.attack(opponent);
        boolean lastAttack = super.attack(opponent);
        boolean attackSuccess = firstAttack || lastAttack;
        return attackSuccess;
    }
}
