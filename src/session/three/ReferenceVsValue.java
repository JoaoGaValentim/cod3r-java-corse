package session.three;

public class ReferenceVsValue {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição p/ valor
        int c = 3;

        a++;
        b--;

        updatePrimitive(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Date currentDate = new Date(); // atribuição p/ referência
        Date customDate = currentDate;

        updateDate(currentDate);

        System.out.println(customDate.day);
        System.out.println(currentDate.day);

        System.out.println(customDate.month);
        System.out.println(currentDate.month);

        System.out.println(customDate.year);
        System.out.println(currentDate.year);
    }

    static void updateDate(Date date) {
        date.day = 14;
        date.month = 4;
        date.year = 2001;
    }

    static void updatePrimitive(int a) {
        a++; // Não gera impacto externo
    }
}
