package session.five.inheritance.inheritancetest;

import session.five.inheritance.inheritancetest.test.Car;
import session.five.inheritance.inheritancetest.test.Civic;
import session.five.inheritance.inheritancetest.test.Ferrari;

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
        System.err.println("Civic após frear => " + civic.getActualSpeed());

        Car ferrari = new Ferrari();
        ferrari.turnOnCar();

        for (int i = 0; i < 10; i++) {
            speed = ferrari.accelerate();
            System.out.println("Velocidade atual da Ferrari => " + speed);
        }

        ferrari.breakCar();
        System.err.println("Ferrari após frear => " + ferrari.getActualSpeed());

        civic.turnOffCar();
        ferrari.turnOffCar();

        System.out.println("Civic está em velocidade => " + civic.getActualSpeed());
        System.out.println("Civic está ligado? " + civic.getCarStatus());

        System.out.println("Ferrari está em velocidade => " + ferrari.getActualSpeed());
        System.out.println("Ferrari está ligada? " + ferrari.getCarStatus());
    }
}
