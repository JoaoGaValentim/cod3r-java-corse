package session.three;

import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        var currentDate = new Date();

        currentDate.day = LocalDateTime.now().getDayOfMonth();
        currentDate.month = LocalDateTime.now().getMonthValue();
        currentDate.year = LocalDateTime.now().getYear();

        System.out.printf("%s-%s-%s\n", currentDate.year, currentDate.month, currentDate.day);

        var date = new Date();

        date.day = 25;
        date.month = 12;
        date.year = 1972;

        System.out.printf("%s-%s-%s\n", date.year, date.month, date.day);
    }
}
