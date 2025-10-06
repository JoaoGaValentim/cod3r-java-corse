package session.six;

import java.util.Arrays;
import java.util.List;

public class ForEachLambda {
    static List<String> approves = Arrays.asList("João", "Clara", "Lucas", "Pedro", "Heloísa");

    public static void main(String[] args) {

        System.out.println("==> Padrão corriqueiro");

        for (String approved : approves) {
            System.out.println(approved);
        }

        System.out.println("----------------------");

        System.out.println("==> Com lambda");

        approves.forEach(name -> System.out.println(name));

        System.out.println("----------------------");

        System.out.println("==> Com Method References");

        approves.forEach(ForEachLambda::printApproves);

        System.out.println("----------------------");
    }

    static String formatInList(String name) {
        return String.format("- %s", name);
    }

    static void printApproves(String name) {
        System.out.println(formatInList(name) + " => Tem " + name.length() + " letra(s)");
    }
}
