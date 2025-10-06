package session.six;

public class Calculator {
    public static void main(String[] args) {
        Calcule calcule = new Sum();
        System.out.println(calcule.calculate(1, 1, Operations.SUM));

        calcule = new Multiplication();
        System.out.println(calcule.calculate(1, 1, Operations.SUM));
    }
}
