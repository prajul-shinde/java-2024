package Exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingPersingExample {
    public static void main(String[] args) {

        // format a localDateTime object

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Formatted date time: " + now.format(dtf));

        // parse date String into localDate Object
        String dateString = "2023-11-21";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("ParsedDate: " + LocalDate.parse(dateString, dtf1));
    }
}
