package session.two.exercises;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class LeapYearExercise {
    public static void main(String[] args) {
        var year = Integer
                .valueOf(JOptionPane.showInputDialog("informe o ano atual:", LocalDateTime.now().getYear()));
        var isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeap) {
            JOptionPane.showMessageDialog(null, "O ano " + year + " é bissexto!");
        }

        if (!isLeap) {
            JOptionPane.showMessageDialog(null, "O ano " + year + " não é bissexto!");
        }
    }
}
