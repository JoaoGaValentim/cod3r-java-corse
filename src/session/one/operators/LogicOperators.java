package session.one.operators;

public class LogicOperators {
    public static void main(String[] args) {
        var isOldPeople = false;
        var isLegalAge = 18 > 17;
        System.out.println(isOldPeople && isLegalAge);
        System.out.println(isLegalAge || isOldPeople);
        System.out.println(!isOldPeople && isLegalAge);
        System.out.println(!(isLegalAge || isOldPeople));
        System.out.println(!!(isLegalAge || isOldPeople));

        // table of and
        System.out.println("Tabela AND");
        System.out.println(true && true); // is true
        System.out.println(false && true); // is false
        System.out.println(true && false); // is false
        System.out.println(false && false); // is false

        // table of or
        System.out.println("Tabela OR");
        System.out.println(true || true); // is true
        System.out.println(false || true); // is true
        System.out.println(true || false); // is true
        System.out.println(false || false); // is false

        // table xor
        System.out.println("Tabela XOR");
        System.out.println(true ^ true); // is false
        System.out.println(false ^ true); // is true
        System.out.println(true ^ false); // is true
        System.out.println(false ^ false); // is false

        // table not
        System.out.println("Tabela NOT");
        System.out.println(!true); // is false
        System.out.println(!false); // is true
    }
}
