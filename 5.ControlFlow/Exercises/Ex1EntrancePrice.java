package Exercises;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex1EntrancePrice {
    public static void main(String[] args) {
        int age = 14;
        String ticketPrice = "0.0";
        if (age < 5)
            ticketPrice = NumberFormat.getCurrencyInstance(Locale.US).format(0);
        else if (age < 12)
            ticketPrice = NumberFormat.getCurrencyInstance(Locale.US).format(5);
        else if (age < 15)
            ticketPrice = NumberFormat.getCurrencyInstance(Locale.US).format(10);
        else
            ticketPrice = NumberFormat.getCurrencyInstance(Locale.US).format(15);

        System.out.println("Ticket price:   " + ticketPrice);
    }
}
