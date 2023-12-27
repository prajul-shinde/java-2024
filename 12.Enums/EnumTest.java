import java.time.DayOfWeek;

public class EnumTest {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;
        DayOfWeek day2 = DayOfWeek.FRIDAY;

        if (day == day2)
            System.out.println("the same day");
        else
            System.out.println("Not the same day");

        System.out.println(day.ordinal());
    }

}
