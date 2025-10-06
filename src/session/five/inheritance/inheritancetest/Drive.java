package session.five.inheritance.inheritancetest;

import session.five.inheritance.inheritancetest.test.Civic;
import session.five.inheritance.inheritancetest.test.Ferrari;

public class Drive {
    public static void main(String[] args) {
        double speed = 0.0;
        Civic civic = new Civic();
        civic.turnOnCar();
        civic.startGPS();
        System.out.println("Velocidade do ar-condicionado => " + civic.airSpeed());

        if (!civic.isDoorsOpen()) {
            for (int i = 0; i < 10; i++) {
                speed = civic.accelerate();
                System.out.println("Velocidade atual do Civic => " + speed);
            }
        }

        civic.breakCar();
        System.err.println("Civic após frear => " + civic.getActualSpeed());

        Ferrari ferrari = new Ferrari();
        ferrari.turnOnCar();
        ferrari.startGPS();

        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                ferrari.onSuperSpeed();
            }

            if (i == 8) {
                ferrari.offSuperSpeed();
            }

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
