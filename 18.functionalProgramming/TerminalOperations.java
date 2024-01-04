import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        List<String> names = List.of("Walnut", "Mandarin", "Snow Flakes");
        Stream<String> namesStream = names.stream();

        // foreach, performs an action for every element in the stream
        namesStream.forEach(System.out::println);

        // count returns number of elements in a stram
        System.out.println(names.stream().count());

        // min, max: return minimun and maximum elements in the stream
        Optional<String> min = names.stream().min((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(min);

        // allmatch: check if all the elements in the stream match a given predicate
        boolean biggerThanFive = names.stream().allMatch(s -> s.length() > 5);
        System.out.println(biggerThanFive);

        // anymatch: check if any of the elements in stream match the given predicate
        boolean anybiggerThanFive = names.stream().anyMatch(s -> s.length() > 5);
        System.out.println(anybiggerThanFive);

        // nonematch: checks if none of the elements in stream match the given predicate
        boolean noneGreaterThanFive = names.stream().noneMatch(s -> s.length() > 5);
        System.out.println(noneGreaterThanFive);

        // collect: transforms the stream into different data structure such as list set
        // or map
        List<String> namesList = names.stream().collect(Collectors.toList());
        System.out.println(namesList);

        // reduce: applies binary operation to the elements of stream, reducing them to
        // a single value
        Optional<String> reducedString = names.stream().reduce(String::concat);
        System.out.println("reducedString " + reducedString);

    }
}
