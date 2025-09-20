package session.one.operators;

public class AttributionOperators {
    public static void main(String[] args) {
        var oneYear = 365;

        oneYear *= 3;
        System.out.println(oneYear);
        oneYear += 2;
        System.out.println(oneYear);
        oneYear -= 2;
        System.out.println(oneYear);
        oneYear /= 3;
        System.out.println((double) oneYear);
        oneYear %= 2;
        System.out.println(oneYear);
    }
}
