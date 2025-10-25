package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o novo nome: ");
            final String name = scanner.nextLine();

            System.out.println("Informe o id da pessoa: ");
            final int id = scanner.nextInt();

            final boolean isUpdated = update(name, id);

            if (id <= 0) {
                System.out.println("ID deve ser um inteiro positivo maior que zero.");
                return;
            }

            if (isUpdated) {
                System.out.println("Registro alterado com sucesso :)");
            }

            if (!isUpdated) {
                System.out.println("Não pude atualizar esse registro :/");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean existsId(int id) {
        final String sql = "SELECT * FROM peoples WHERE id = ?";
        Connection connection = ConnectionFactory.connect();
        boolean exists = false;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            exists = result.next();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            exists = false;
        }

        return exists ? true : false;
    }

    static boolean update(String name, int id) {
        final String sql = "UPDATE peoples SET name = ? WHERE id = ?";
        Connection connection = ConnectionFactory.connect();
        boolean isUpdated = false;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            if (existsId(id)) {
                statement.setString(1, name.trim());
                statement.setInt(2, id);
                statement.execute();
                isUpdated = true;
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            return false;
        }

        return isUpdated ? true : false;
    }
}
