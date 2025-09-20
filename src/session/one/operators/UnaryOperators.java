package session.one.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        var oneYear = 365;
        oneYear++; // postfix
        System.out.println(oneYear);
        ++oneYear;
        System.out.println(oneYear);
        oneYear--;
        System.out.println(oneYear);
        --oneYear; // prefix
        // a-- = compara antes de decrementar
        // ++a decrementa e compara
        System.out.println(++oneYear == oneYear--); // true
    }
}
