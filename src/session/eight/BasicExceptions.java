package session.eight;

import session.seven.universe.components.Galaxy;

public class BasicExceptions {
    public static void main(String[] args) {
        Galaxy galaxy = null;

        try {
            printGalaxy(galaxy);
        } catch (Exception e) {
            System.out.println("Galáxia não pode ser nula: " + e.getMessage());
//            e.printStackTrace();
        }

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Não existe divisão por zero: " + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("end.");
    }

    static void printGalaxy(Galaxy galaxy) {
        System.out.println(galaxy.getName());
    }
}
