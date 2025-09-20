package session.one;

import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        Double firstValue = Double.valueOf(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        Double lastValue = Double.valueOf(JOptionPane.showInputDialog("Informe o segundo valor: "));
        String operation = JOptionPane.showInputDialog("Informe uma das 4 operações (+, -, * ou /): ");

        Double resultOperation = 0.0;
        resultOperation = "+".equals(operation) ? firstValue + lastValue : resultOperation;
        resultOperation = "-".equals(operation) ? firstValue - lastValue : resultOperation;
        resultOperation = "*".equals(operation) ? firstValue * lastValue : resultOperation;
        resultOperation = "/".equals(operation) ? firstValue / lastValue : resultOperation;

        String formattedResult = String.format("RESULTADO DE %s %s %s = %.2f", firstValue, operation, lastValue,
                resultOperation);

        JOptionPane.showMessageDialog(null, formattedResult, "Resultado da operação matemática",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
