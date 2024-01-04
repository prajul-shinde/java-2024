package exerccises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueEx7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        max.ifPresent(System.out::println);
    }
}
