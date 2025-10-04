package session.five.onone;

public class OneToOneTest {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.carIsTurnOn());

        car.turnOnCar();

        System.out.println(car.carIsTurnOn());
        System.out.println(car.engine.injectionFactor);

        for (int i = 0; i < 4; i++) {
            car.accelerate();
            car.breakCar();
        }

        System.out.println(car.engine.turn());
        // System.out.println(car.engine.car.engine.car); bidirectional relationship
    }
}
