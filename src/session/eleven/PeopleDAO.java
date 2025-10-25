package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class PeopleDAO {
    private Connection connection;
    private final String TABLE = "peoples";
    private final List<String> fields = Arrays.asList("id", "name");

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        connection = ConnectionFactory.connect();
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            connection = null;
        }
    }

    public boolean save(People... peoples) {
        final String sql = String.format("INSERT INTO %s (%s) VALUES(?)", TABLE, fields.get(1));
        boolean isSave = false;

        try (PreparedStatement statement = getConnection().prepareStatement(sql,
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            for (People people : peoples) {
                statement.setString(1, people.getName());
                isSave = statement.executeUpdate() > 0 ? true : false;
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return isSave;
    }
}
