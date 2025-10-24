package session.eleven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection connect() {
        try {
            final String host = "jdbc:mysql://localhost/java_course?useSSL=true&VerifyServerCertificate=false";
            final String user = "root";
            final String password = "123456";

            return DriverManager.getConnection(host, user,
                    password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
