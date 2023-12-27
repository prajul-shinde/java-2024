package Exercises.exercise1BasicEnum;

import java.util.Arrays;

public class BasicEnumExample {
    public static void main(String[] args) {

        Arrays.asList(Weekday.values()).forEach(System.out::println);
    }
}
