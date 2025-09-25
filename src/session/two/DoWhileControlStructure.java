package session.two;

public class DoWhileControlStructure {
    public static void main(String[] args) {
        boolean isRunning = true;
        int counter = 0;
        long longNumber = 1L;
        double totalMultiply = longNumber;

        do {
            System.out.printf("%s \n", totalMultiply);

            if (counter == 100) {
                isRunning = false;
            }

            counter++;
            totalMultiply *= counter;
        } while (isRunning);
    }
}
