package session.four;

public class ArrayExercise {
    static double calculateUNIVESPaverage(double[] weeksMentions, double testMention) {
        double finalAverage = 0.0;
        double sumWeeksTest = 0.0;
        double weeksTestsAverage = 0.0;

        for (int i = 0; i < weeksMentions.length; i++) {
            sumWeeksTest += weeksMentions[i];
        }

        weeksTestsAverage = sumWeeksTest / weeksMentions.length;
        finalAverage = (weeksTestsAverage * 0.4) + (testMention * 0.6);

        return finalAverage;
    }

    static void showMentionsTable(double[] weeksMentions) {
        for (int i = 0; i < weeksMentions.length; i++) {
            System.out.printf("|   Sem. %s  ", (i + 1));
        }

        System.err.println();

        for (int i = 0; i < weeksMentions.length; i++) {
            System.out.printf("|   %.2f   ", weeksMentions[i]);
        }

        System.err.println();
    }

    public static void main(String[] args) {
        // int[] values = new int[10];
        // System.out.println(Arrays.toString(values)); // inicia com valores default

        // values[0] = 10;
        // values[1] = 20;
        // values[2] = 30;
        // values[3] = 40;
        // values[4] = 50;
        // values[5] = 60;
        // values[6] = 70;
        // values[7] = 80;
        // values[8] = 90;
        // values[9] = 100;

        // double count = 0;
        // for (int i = 0; i < values.length; i++) {
        // values[i] = (i + 1) * 20;
        // count += (i + 1.0) * 20.0;
        // }

        // String content = Arrays.toString(values);
        // System.out.println(content);
        // System.err.println(count / values.length);

        double[] weeksMentions = { 10.0, 10.0, 10.0, 10.0, 10.0, 9.8, 7.88 };
        double testMention = 10.0;
        double average = calculateUNIVESPaverage(weeksMentions, testMention);

        showMentionsTable(weeksMentions);
        System.out.println("| Nota da prova: " + testMention + "| Média final: " + average + "|");
    }
}
