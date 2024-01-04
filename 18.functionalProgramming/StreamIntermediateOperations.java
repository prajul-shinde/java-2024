import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {

        List<String> names = List.of("Walnut, Mandarin", "Snowflake", "Bobby", "Roxy");

        // filter: filters stream based on predicate.
        Stream<String> namesStartsWithB = names.stream().filter(name -> name.startsWith("B"));

        // map: applies a function to each element in a stream.
        Stream<Integer> namesLength = names.stream().map(String::length);

        // flatmap: applies a function to each element in stream and flattens the
        // resulting streams into single stream.
        List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Bobby", "Django"),
                Arrays.asList("Mandarin", "Walnut", "Snowflake"));
        Stream<String> flatnames = nestedNames.stream().flatMap(Collection::stream);

        // limit: limits the stream to a certain number of elements.
        Stream<String> firstThreeNames = names.stream().limit(3);

        // skip: skips the first n elements in the stream.
        Stream<String> namesWithoutFirstTwo = names.stream().skip(2);

        // peek: performs an action on each element in stream without modifying the
        // stream.
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        // distincts: removes duplicate elements from stream.
        Stream<String> distinctNames = names.stream().distinct();

        // sorted: sorts the elements in the stream according to comparator.
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());

    }
}
