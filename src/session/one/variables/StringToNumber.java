package session.one.variables;

import javax.swing.JOptionPane;

public class StringToNumber {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Informe a quantidade de produtos: ");
		String price = JOptionPane.showInputDialog("Informe o preço unitário: ");

		Double total = Double.valueOf(price) * Integer.valueOf(quantity);

		String message = String.format("Total de produtos: %s %n Valor total (R$): %.2f", quantity, total);

		JOptionPane.showMessageDialog(null, message);
	}
}
