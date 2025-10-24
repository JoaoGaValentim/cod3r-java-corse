package session.ten.jswing;

import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class FrameSwing extends JFrame implements PeopleObserver {
    private final List<People> peoples = Arrays.asList(
            new People("João", 24),
            new People("Clara", 29),
            new People("Lucas", 22),
            new People("Heloisa", 21));
    private JTable table = new JTable();
    private String[] columns = { "Nome", "Idade" };

    public FrameSwing() {
        PeopleSubject subject = new PeopleSubject();
        subject.addObserver(this);

        setLayout(new GridLayout(2, 1));

        add(new JScrollPane(table));

        peoples.forEach(
                people -> subject.addPeople(people));

        JButton addPeopleButton = new JButton("+");
        // JButton removeButton = new JButton("CLS");

        addPeopleButton.addActionListener(e -> {
            System.out.println(e.getID());
            subject.addPeople(new People("Thais", 24));
            subject.addPeople(new People("Pedro", 24));
            subject.addPeople(new People("Laura", 24));
        });
        // removeButton.addActionListener(e -> subject.remove("Thais"));

        add(addPeopleButton);
        // add(removeButton);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrameSwing();
        });
    }

    private String[][] listToMatrix(List<People> list, int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < list.size(); i++) {
            People people = list.get(i);
            matrix[i][0] = people.getName();
            matrix[i][1] = String.valueOf(people.getAge());
        }
        return matrix;
    }

    @Override
    public void refresh(List<People> peoples) {
        Object[][] data = listToMatrix(peoples, peoples.size(), 2);
        DefaultTableModel model = new DefaultTableModel(data, columns);
        table.setModel(model);
    }
}
