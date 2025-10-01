package session.two.exercises;

import javax.swing.JOptionPane;

public class StudentAverageCalculator {
    public static void main(String[] args) {

        String message = "";
        double activitiesMentionTotal = 0.0;

        double disciplineTestPoints = Double
                .valueOf(JOptionPane.showInputDialog("Informe a sua nota da prova regular: ")) * 0.4;

        activitiesMentionTotal = Double
                .valueOf(JOptionPane.showInputDialog("Informe sua média da disciplina no AVA: ")) * 0.6;

        activitiesMentionTotal += disciplineTestPoints;
        double average = activitiesMentionTotal;

        message = String.format("Sua média final é %.2f \n", average);

        boolean isApproved = average >= 5.0 && average <= 10.0;

        if (isApproved) {
            message += "Você foi aprovado(a)!";
            JOptionPane.showMessageDialog(null, message);
        }

        if (!isApproved) {
            message += "Você foi reprovado(a) e vai para exame!";
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
