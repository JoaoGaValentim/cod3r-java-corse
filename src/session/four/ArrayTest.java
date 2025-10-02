package session.four;

import javax.swing.JOptionPane;

public class ArrayTest {
    public static void main(String[] args) {
        var totalActivitiesMentions = Integer.valueOf(JOptionPane.showInputDialog("Quantas notas o aluno tem? "));
        var sumMentions = 0.0;
        var average = 0.0;
        // array of mentions
        double[] studentMentions = new double[totalActivitiesMentions];

        for (int i = 0; i < studentMentions.length; i++) {
            studentMentions[i] = Double.valueOf(JOptionPane.showInputDialog("Nota  " + (i + 1) + ": "));
        }

        for (double mention : studentMentions) {
            sumMentions += mention;
        }

        average = sumMentions / studentMentions.length;

        String message = String.format("Sua média foi de %.2f", average);

        JOptionPane.showMessageDialog(null, message);
    }
}
