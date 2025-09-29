package session.three;

import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        var currentDate = new Date();
        currentDate.day = LocalDateTime.now().getDayOfMonth();
        currentDate.month = LocalDateTime.now().getMonthValue();
        currentDate.year = LocalDateTime.now().getYear();

        var date = new Date();
        date.day = 25;
        date.month = 12;
        date.year = 1972;

        currentDate.printDate();
        date.printDate();

        var currentDateFormatted = currentDate.getFormattedDate();

        System.out.println(currentDateFormatted);
    }
}
