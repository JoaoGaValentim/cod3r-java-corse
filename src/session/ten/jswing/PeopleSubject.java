package session.ten.jswing;

import java.util.ArrayList;
import java.util.List;

public class PeopleSubject {
    private final List<People> peoples = new ArrayList<>();
    private final List<TableObserver> observers = new ArrayList<>();

    public void addObserver(TableObserver observer) {
        observers.add(observer);
    }

    public void addPeople(People people) {
        peoples.add(people);
        observers.forEach(observer -> observer.refresh(peoples));
    }

    public void remove(String name) {
        People people = peoples.stream()
                .filter(peoples -> peoples.getName().equalsIgnoreCase(name))
                .findAny().get();

        peoples.remove(people);
        observers.forEach(observer -> observer.refresh(peoples));
    }
}
