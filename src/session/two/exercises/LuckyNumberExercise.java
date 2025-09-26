package session.two.exercises;

import java.util.Random;
import java.util.random.RandomGenerator;

import javax.swing.JOptionPane;

public class LuckyNumberExercise {
    public static void main(String[] args) {
        int counter = 0;
        int lives = 10;
        int randomNumber = Random.from(RandomGenerator.getDefault()).nextInt(101);

        while (counter <= 100) {
            String message = String.format("""
                        Você tem %s tentativas restantes
                        Em que número pensei?
                    """, lives);
            int userInput = Integer.valueOf(JOptionPane.showInputDialog(message));

            if (randomNumber < userInput) {
                JOptionPane.showMessageDialog(null, "Errou! O Valor é alto.");
                lives--;
            }

            if (userInput < 0) {
                JOptionPane.showMessageDialog(null, "Informe valores entre 0-100");
                continue;
            }

            if (userInput < randomNumber) {
                JOptionPane.showMessageDialog(null, "Errou! O Valor é baixo.");
                lives--;
            }

            if (userInput > 100) {
                JOptionPane.showMessageDialog(null, "Errou! O valor está fora do intervalo");
                lives--;
            }

            if (userInput == randomNumber) {
                message = String.format("""
                          Parabéns! você acertou na %s tentativa.
                          Eu pensei em %s!
                        """, lives, randomNumber);
                JOptionPane.showMessageDialog(null, message);
                break;
            }

            if (lives == 0) {
                message = String.format("""
                          Game Over :/
                          Eu pensei em %s!
                        """, lives, randomNumber);
                JOptionPane.showMessageDialog(null, message);
                break;
            }

            counter++;
        }
    }
}
