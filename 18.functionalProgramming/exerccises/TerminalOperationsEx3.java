package exerccises;

import java.util.List;

public class TerminalOperationsEx3 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long evnCount = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("evenNumCount: " + evnCount);

    }
}
