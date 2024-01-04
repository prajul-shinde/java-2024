package exerccises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsEx4 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hello", "world", "functional", "programming");
        List<String> result = strings.stream().filter(s -> s.length() > 5).map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("strings greater than 5 and tranformed to uppercase: " + result);

    }
}
