package session.one.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // > maior que
        // < menor que
        // >= maior ou igual a que
        // <= menor ou igual a que
        // % módulo
        // == igual a
        // != diferente
        // = atribuição

        var aNumericNumber = 97;
        var aCharValue = 'a';

        System.out.println(aNumericNumber == aCharValue); // a unicode = 97

        var aircraftSize = 1000;

        System.out.println(aircraftSize >= 1000);
        System.out.println(aircraftSize > 1000);
        System.out.println(aircraftSize < 1000);
        System.out.println(aircraftSize <= 1000);
        System.out.println(aircraftSize != 1000);
    }
}
