package session.three;

public class Date {
    int year;
    int day;
    int month;

    Date() {
        // byte, short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> '\u0000'
        // Object -> null

        // int a; // não inicia por padrão (definição de linguagem)
        // The local variable a may not have been initialized
        // Java(536870963)
        // System.out.println(a);
        // int a = 0; -> você tem que inicializar
        this(1970, 1, 1);
    }

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /***
     * <h4>formatDateValue</h4>
     * <p>
     * This method format decimal houses to left.
     * 
     * <p>
     * if decimalInt <= 9 then "0" + decimalInt else decimalInt
     * 
     * @param value
     * @return valueFormatted
     * @see #formatDateValue(int)
     */
    String formatDateValue(int value) {
        return value <= 9 ? "0" + value : String.valueOf(value);
    }

    /**
     * <h4>getFormattedDate</h4>
     * <p>
     * This method return a formatted date in US pattern
     * 
     * @since 1.0
     * @return YYYY-MM-DD
     * @see #getFormattedDate()
     */
    String getFormattedDate() {
        final String pattern = "%s-%s-%s"; // local
        return String.format(pattern, formatDateValue(year), formatDateValue(month), formatDateValue(day));
    }

    /**
     * <h4>printDate</h4>
     * 
     * <p>
     * This method print date
     * 
     * @since 1.0
     * @see #printDate()
     */
    void printDate() {
        System.out.println(getFormattedDate());
    }

    // static void agora() {
    // // this é inválido dentro de
    // // métodos estáticos
    // }
}
