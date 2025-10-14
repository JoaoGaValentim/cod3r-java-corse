package session.ten.birthday;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doorman {
    private List<ArrivalAnniversaryObserver> observers = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void registerEvent(ArrivalAnniversaryObserver o) {
        observers.add(o);
    }

    public void monitor() {
        var value = "";
        while (!"exit".equalsIgnoreCase(value)) {
            System.out.print("Chegou? ");
            value = sc.nextLine();

            if ("yes".equalsIgnoreCase(value)) {
                EventArrivalAnniversary e = new EventArrivalAnniversary(new Date());
                observers.stream().forEach(observer -> observer.arrived(e));
                return;
            }

            System.out.println("Alarme falso...");
        }

        sc.close();
    }
}
