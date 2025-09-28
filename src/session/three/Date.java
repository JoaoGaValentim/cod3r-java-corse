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
     * <h4>getFormattedDate</h4>
     * 
     * <p>
     * This method return a formatted date in US pattern
     * 
     * @see #getFormattedDate(int, int, int)
     * @since 1.0
     * @param year
     * @param month
     * @param day
     * @return YYYY-MM-DD
     */
    String getFormattedDate(int year, int month, int day) {
        return String.format("%s-%s-%s", year, month, day);
    }
}
