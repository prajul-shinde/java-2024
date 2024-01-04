package exerccises;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresEx6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // identity: starting with initial sum of 0
        Integer sumOfSquares = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sumOfSquares);
    }
}
