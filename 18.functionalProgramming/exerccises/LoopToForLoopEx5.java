package exerccises;

import java.util.Arrays;
import java.util.List;

public class LoopToForLoopEx5 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hello", "world", "functional", "programming");

        // Using a for loop
        for (String s : strings) {
            System.out.println(s);
        }

        // Using forEach and a lambda expression
        strings.forEach(System.out::println);
    }
}
