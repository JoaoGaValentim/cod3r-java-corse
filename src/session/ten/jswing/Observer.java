package session.ten.jswing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observer {
    public static void main(String[] args) {
        JFrame window = new JFrame("First Swing app");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null); // center desktop

        JButton button = new JButton("Aperte!");

        button.addActionListener(e -> {
            System.out.println(e.toString());
            System.out.println("Evento ocorreu");
        });

        window.add(button);
        window.setLayout(new FlowLayout());
        window.setVisible(true);
    }
}
