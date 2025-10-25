package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SimpleSelect {
    public static void main(String[] args) {
        final String sql = "SELECT * FROM peoples;";

        try (Connection connection = ConnectionFactory.connect();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery()) {

            List<People> peoples = new ArrayList<>();

            while (result.next()) {
                final int id = result.getInt("id");
                final String name = result.getString("name");
                peoples.add(new People(id, name));
            }

            peoples.forEach(people -> System.out.println(people.getId() + " - " + people.getName()));
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
