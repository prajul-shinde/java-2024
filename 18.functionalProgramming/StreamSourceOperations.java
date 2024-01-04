import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSourceOperations {
    public static void main(String[] args) {

        // creating stream from collection
        List<String> names = List.of("Walnut", "Mandarin", "Snow flake");
        Stream<String> namesStream = names.stream();

        // creating stream from an array
        String[] namesArray = { "Walnut", "Mandarin", "Snow flake" };
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // creating stream using stream.iterate() method
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1);

        // creating stream using Stream.generate method
        Stream<Double> randonNumberStream = Stream.generate(Math::random);
    }

}
