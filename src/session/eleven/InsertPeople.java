package session.eleven;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import session.eleven.models.People;
import session.eleven.models.PeopleObservable;
import session.eleven.models.interfaces.Observer;

public class InsertPeople extends JFrame implements Observer {
    private final JLabel label = new JLabel("Informe o nome da pessoa: ");
    private final JTextField field = new JTextField();
    private final JButton btnSave = new JButton("Salvar");
    private final TablePeoples tablePeoples = new TablePeoples();

    public InsertPeople() {
        setTitle("Adicionar pessoa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());

        JPanel content = new JPanel();
        content.setBorder(new EmptyBorder(10, 10, 10, 10));
        content.setLayout(new GridLayout(3, 1));

        PeopleObservable observable = new PeopleObservable();
        observable.subscribe(this);

        content.add(label);
        content.add(field);
        content.add(btnSave);

        btnSave.addActionListener(
                new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        if (field.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(content, "Informe um nome valido");
                            return;
                        }

                        try {
                            Connection connection = ConnectionFactory.connect();

                            String sql = """
                                    INSERT INTO peoples (name) VALUES (?);
                                    """;

                            PreparedStatement statement = connection.prepareStatement(sql);
                            statement.setString(1, field.getText());
                            statement.execute();
                            JOptionPane.showMessageDialog(content, field.getText() + " salvo com sucesso :)");
                            connection.close();
                            observable.loadPeoplesFromDatabase();

                        } catch (SQLException e1) {
                            throw new RuntimeException(e1);
                        }
                    };
                });

        add(content);
        setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(InsertPeople::new);
    }

    @Override
    public void updateTable(List<People> peoples) {
        tablePeoples.updateTable(peoples);
    }
}
