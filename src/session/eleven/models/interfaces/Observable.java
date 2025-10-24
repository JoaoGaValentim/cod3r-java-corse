package session.eleven.models.interfaces;

public interface Observable {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyObservers();
}
