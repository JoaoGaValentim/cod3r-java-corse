package session.eleven;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Properties getConnectionProperties() throws IOException {
        Properties properties = new Properties();
        String file = "/java-connection.properties";
        properties.load(ConnectionFactory.class.getResourceAsStream(file));
        return properties;
    }

    public static Connection connect() {
        try {
            String url = getConnectionProperties().getProperty("jdbc.url");
            String user = getConnectionProperties().getProperty("jdbc.user");
            String password = getConnectionProperties().getProperty("jdbc.password");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
