package session.five.inheritance.test;

public class Player {
    private double positionX;
    private double positionY;
    private int life;
    protected int id;
    public String name;

    public Player() {
        positionX = 0.0;
        positionY = 0.0;
    }

    public Player(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.life = 100;
    }

    public boolean walk(Direction direction) {
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

    public boolean attack(Player opponent) {
        double deltaX = Math.abs(this.positionX - opponent.positionX);
        double deltaY = Math.abs(this.positionY - opponent.positionY);
        boolean attackSuccess = false;

        if ((deltaX == 0.0 && deltaY == 1.0) || (deltaX == 1.0 && deltaY == 0.0)) {
            opponent.life -= 10;
            attackSuccess = true;
        }

        return attackSuccess;
    }

    public int getLife() {
        return life;
    }
}
