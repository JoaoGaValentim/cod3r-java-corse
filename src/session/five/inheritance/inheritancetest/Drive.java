package session.five.inheritance.inheritancetest;

public class Drive {
    public static void main(String[] args) {
        double speed = 0.0;
        Car civic = new Civic();
        civic.turnOnCar();

        for (int i = 0; i < 10; i++) {
            speed = civic.accelerate();
            System.out.println("Velocidade atual do Civic => " + speed);
        }

        civic.breakCar();
        System.err.println("Civic após frear => " + civic.actualSpeed);

        Car ferrari = new Ferrari();
        ferrari.turnOnCar();

        for (int i = 0; i < 10; i++) {
            speed = ferrari.accelerate();
            System.out.println("Velocidade atual da Ferrari => " + speed);
        }

        ferrari.breakCar();
        System.err.println("Ferrari após frear => " + ferrari.actualSpeed);

        civic.turnOffCar();
        ferrari.turnOffCar();

        System.out.println("Civic está em velocidade => " + civic.actualSpeed);
        System.out.println("Civic está ligado? " + civic.carIsOn);

        System.out.println("Ferrari está em velocidade => " + ferrari.actualSpeed);
        System.out.println("Ferrari está ligada? " + ferrari.carIsOn);
    }
}
