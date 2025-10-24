package session.eleven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        // connections sting
        final String host = "jdbc:mysql://localhost?useSSL=true&VerifyServerCertificate=false";
        final String user = "root";
        final String password = "123456";

        // implement connection
        final Connection connection = DriverManager.getConnection(host, user, password);
        System.out.println("Conectado");
        connection.close();
    }
}
