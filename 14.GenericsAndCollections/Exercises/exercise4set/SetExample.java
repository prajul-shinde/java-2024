package Exercises.exercise4set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4));
    }
}
