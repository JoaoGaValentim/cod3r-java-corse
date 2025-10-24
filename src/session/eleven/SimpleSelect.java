package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import session.eleven.models.People;

public class SimpleSelect {
    public static void main(String[] args) {
        final String sql = "SELECT * FROM peoples;";
        final List<HashMap<Integer, People>> peoples = new ArrayList<>();

        try (Connection connection = ConnectionFactory.connect();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                HashMap<Integer, People> map = new HashMap<>();
                map.put(resultSet.getInt("id"), new People(resultSet.getString("name")));
                peoples.add(map);
            }

            connection.close();
        } catch (SQLException e) {
            Logger.getLogger("SQLException").info(e.getSQLState());
        }

        peoples.stream().flatMap(people -> people.entrySet().stream()).forEach(
                entry -> System.out.println("#" + entry.getKey() + " : " + entry.getValue().getName()));
    }
}
