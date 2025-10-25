package session.eleven;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertPeople extends JFrame {
    private final JLabel label = new JLabel("Informe o nome da pessoa: ");
    private final JTextField field = new JTextField();
    private final JButton btnSave = new JButton("Salvar");

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
                            PeopleDAO dao = new PeopleDAO();
                            boolean isSave = dao.save(new People(0, field.getText()));
                            dao.close();
                            if (isSave) {
                                JOptionPane.showMessageDialog(content, field.getText() + " foi salvo com sucesso :)");
                            }
                        } catch (RuntimeException error) {
                            JOptionPane.showMessageDialog(content, error.toString() + " ocorreu!", "erro", ERROR);
                        }
                    };
                });

        add(content);
        setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(InsertPeople::new);
    }
}
