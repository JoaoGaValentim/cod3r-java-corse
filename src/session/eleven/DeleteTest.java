package session.eleven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o id da pessoa: ");
            final int id = scanner.nextInt();

            final boolean isDeleted = delete(id);

            if (id <= 0) {
                System.out.println("ID deve ser um inteiro positivo maior que zero.");
                return;
            }

            if (isDeleted) {
                System.out.println("Registro excluido com sucesso :)");
            }

            if (!isDeleted) {
                System.out.println("Não pude excluir esse registro :/");
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

    static boolean delete(int id) {
        final String sql = "DELETE FROM peoples WHERE id = ?";
        Connection connection = ConnectionFactory.connect();
        boolean isDeleted = false;
        int count = 0;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            if (existsId(id)) {
                statement.setInt(1, id);
                count = statement.executeUpdate();
                isDeleted = count > 0 ? true : false;
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            return false;
        }

        System.out.println("Linhas afetadas : " + count);
        return isDeleted ? true : false;
    }
}
