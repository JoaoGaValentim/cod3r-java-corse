package session.three;

public class Date {
    int year;
    int day;
    int month;

    /**
     * <h4>getFormattedDate</h4>
     * <p>
     * This method return a formatted date in US pattern
     * 
     * @see #getFormattedDate()
     * @since 1.0
     * @return YYYY-MM-DD
     */
    String getFormattedDate() {
        return String.format("%s-%s-%s", year, month, day);
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
}
