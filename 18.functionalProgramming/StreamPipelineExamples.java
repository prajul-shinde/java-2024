import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPipelineExamples {
    public static void main(String[] args) {

        List<String> names = List.of("Walnut", "Mandarin", "Snowflake", "Bobby", "Roxy");

        // example 1: filtering and collecting list of names
        List<String> namesStartingWithB = names.stream().filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(namesStartingWithB);

        // example 2: Finding the longest name
        Optional<String> longestName = names.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestName);

        // example 3: transforming list of strings into set of integers
        Set<Integer> uniqueIntegers = names.stream().map(String::length).distinct().collect(Collectors.toSet());
        System.out.println(uniqueIntegers);

        // example 4: Concatenating strings with a custom seperator
        String concatenatedNames = names.stream().collect(Collectors.joining(","));
        System.out.println(concatenatedNames);

    }
}
