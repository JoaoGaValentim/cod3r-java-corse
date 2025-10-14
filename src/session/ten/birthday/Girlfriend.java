package session.ten.birthday;

public class Girlfriend implements ArrivalAnniversaryObserver {
    public void arrived(EventArrivalAnniversary e) {
        System.out.println("Avisar convidados...");
        System.out.println("Apagar luzes...");
        System.out.println("Esperar...");
        System.out.println("Surpresa!!!");
        System.out.println(e.getMoment());
    }
}
