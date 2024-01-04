import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReference {
    public static void main(String[] args) {

        // reference to static method
        Function<Integer, String> nrToHexString = i -> Integer.toHexString(i);
        Function<Integer, String> nrToHexStringMethodReference = Integer::toHexString;
        System.out.println(nrToHexStringMethodReference.apply(256));

        // reference to instance method of a particular object
        String prefix = "hello";
        Function<String, String> greet = s -> prefix + s;
        Function<String, String> greetMethodReference = prefix::concat;
        System.out.println(greetMethodReference.apply("world"));

        // reference to an instance method of an arbitary object of a particular type of
        // object
        BiFunction<String, String, Integer> stringComparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringComparatorMethodReference = String::compareToIgnoreCase;
        System.out.println(stringComparatorMethodReference.apply("hello", "Hello"));

        // referenc to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("maiike");
        System.out.println(names.get(0));

    }
}
