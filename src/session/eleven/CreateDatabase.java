package session.eleven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {
        final String host = "jdbc:mysql://localhost?useSSL=true&VerifyServerCertificate=false";
        final String user = "root";
        final String password = "123456";

        final Connection connection = DriverManager.getConnection(host, user,
                password);
        final Statement statement = connection.createStatement();

        String query = """
                CREATE DATABASE IF NOT EXISTS java_course;
                """;

        statement.execute(query);
        System.out.println("Banco criado com sucesso!");
        connection.close();

        // ConnectionFactory.connect(host, user, password).query(query).close();
    }
}
