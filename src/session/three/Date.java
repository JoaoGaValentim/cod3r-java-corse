package session.three;

public class Date {
    int year;
    int day;
    int month;

    Date() {
        // this.day = 1;
        // this.month = 1;
        // this.year = 1970;
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
