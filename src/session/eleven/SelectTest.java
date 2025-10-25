package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectTest {
    public static void main(String[] args) {
        String sql = "SELECT * FROM peoples WHERE name LIKE ?";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a parte de um nome: ");
        String namePartition = scanner.nextLine();

        System.out.println("Quais resultados quer ? ");
        System.out.println("- Todos (T) ");
        System.out.println("- Esquerda (E) ");
        System.out.println("- Direita (D) ");
        System.out.println("Escolha: ");
        final String queryPosition = scanner.nextLine();

        System.out.println("---------------------------");

        try (Connection connection = ConnectionFactory.connect();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            namePartition = namePartition.replace("%", "");

            if ("t".equalsIgnoreCase(queryPosition)) {
                statement.setString(1, "%" + namePartition + "%");
            }

            if ("e".equalsIgnoreCase(queryPosition)) {
                statement.setString(1, "%" + namePartition);
            }

            if ("d".equalsIgnoreCase(queryPosition)) {
                statement.setString(1, namePartition + "%");
            }

            ResultSet result = statement.executeQuery();

            List<People> peoples = new ArrayList<>();

            while (result.next()) {
                final int id = result.getInt("id");
                final String name = result.getString("name");
                peoples.add(new People(id, name));
            }

            System.out.println("Resultado: ");

            if (peoples.size() == 0) {
                System.out.println("Nada foi encontrado :/");
            }

            if (peoples.size() > 0) {
                peoples.forEach(people -> System.out.println("#" + people.getId() + " - " + people.getName()));
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------");
        scanner.close();
    }
}
