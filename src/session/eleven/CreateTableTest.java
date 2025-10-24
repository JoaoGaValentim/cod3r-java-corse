package session.eleven;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableTest {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionFactory.connect();

        final String sql = """
                    CREATE TABLE IF NOT EXISTS peoples (
                        id INT NOT NULL AUTO_INCREMENT,
                        name VARCHAR(80) NOT NULL,
                        PRIMARY KEY (id)
                    );
                """;

        Statement statement = connection.createStatement();
        statement.execute(sql);

        System.out.println("Tabela pessoa criada com sucesso!");

        connection.close();
    }
}
