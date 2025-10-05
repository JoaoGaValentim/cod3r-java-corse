package session.five.inheritance;

public class Player {
    double positionX;
    double positionY;
    int life = 100;

    boolean walk(Direction direction) {
        switch (direction) {
            case Direction.NORTH:
                positionY--;
                break;
            case Direction.LAST:
                positionX++;
                break;
            case Direction.SOUTH:
                positionY++;
                break;
            case Direction.WEST:
                positionX--;
                break;
            default:
                break;
        }
        return true;
    }

    boolean attack(Player opponent) {
        double deltaX = Math.abs(positionX - opponent.positionX);
        double deltaY = Math.abs(positionY - opponent.positionY);
        boolean attackSuccess = false;

        if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
            opponent.life -= 10;
            attackSuccess = true;
        }

        return attackSuccess;
    }
}
