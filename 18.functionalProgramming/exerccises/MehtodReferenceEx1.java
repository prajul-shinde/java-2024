package exerccises;

import java.util.List;
import java.util.stream.Collectors;

public class MehtodReferenceEx1 {
    public static void main(String[] args) {

        List<String> strings = List.of("hello", "world", "functional", "programming");
        List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseStrings);

    }

}
