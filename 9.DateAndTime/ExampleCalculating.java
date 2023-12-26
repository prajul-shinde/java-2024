import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculating {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourFromNow = now.plusHours(1);

        System.out.println(now + " 1 hr= " + oneHourFromNow);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(1));

        System.out.println(today + " one year ago= " + oneYearAgo);
        System.out.println(today + " one year ago= " + oneYearAgo2);
    }
}
