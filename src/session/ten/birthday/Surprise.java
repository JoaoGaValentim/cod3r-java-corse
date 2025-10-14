package session.ten.birthday;

public class Surprise {
    public static void main(String[] args) {
        Girlfriend girlfriend = new Girlfriend();
        Doorman doorman = new Doorman();

        doorman.registerEvent(e -> System.out.println("Surpresa!!! " + e.getMoment()));
        doorman.registerEvent(girlfriend);
        doorman.monitor();
    }
}
