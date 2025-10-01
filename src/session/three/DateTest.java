package session.three;

import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        var date = new Date();
        var currentDate = new Date();
        currentDate.day = LocalDateTime.now().getDayOfMonth();
        currentDate.month = LocalDateTime.now().getMonthValue();
        currentDate.year = LocalDateTime.now().getYear();

        date.printDate();
        currentDate.printDate();

        var currentDateFormatted = currentDate.getFormattedDate();

        System.out.println(currentDateFormatted);
    }
}
