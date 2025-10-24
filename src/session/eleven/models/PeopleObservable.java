package session.eleven.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import session.eleven.ConnectionFactory;
import session.eleven.models.interfaces.Observable;
import session.eleven.models.interfaces.Observer;

public class PeopleObservable implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private final List<People> peoples = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        peoples.clear();

        String sql = "SELECT name FROM peoples;";

        try (Connection connection = ConnectionFactory.connect();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                peoples.add(new People(resultSet.getString("name")));
            }

        } catch (SQLException e) {
            System.err.println("Erro ao carregar pessoas do banco: " + e.getMessage());
        }

        observers.forEach(observer -> observer.updateTable(peoples));
    }
}