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

        var currentFormattedDate = currentDate.getFormattedDate();
        var formattedDate = date.getFormattedDate();

        System.out.printf("%s\n", currentFormattedDate);
        System.out.printf("%s\n", formattedDate);
    }
}
