package session.eleven;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import session.eleven.models.People;
import session.eleven.models.PeopleObservable;
import session.eleven.models.interfaces.Observer;

public class TablePeoples extends JFrame implements Observer {
    private final JTable table;

    public TablePeoples() {
        setTitle("Buscar pessoas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        DefaultTableModel model = new DefaultTableModel(new Object[] { "Nome" }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        PeopleObservable observable = new PeopleObservable();
        observable.subscribe(this);
        observable.loadPeoplesFromDatabase();

        setVisible(true);
    }

    @Override
    public void updateTable(List<People> peoples) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // limpa linhas

        for (People people : peoples) {
            model.addRow(new Object[] { people.getName() });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TablePeoples::new);
    }
}
