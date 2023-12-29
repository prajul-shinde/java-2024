import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFunctionalInterfaces {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> "hello";
        System.out.println(s1.get());

        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("Hello from consumer");

        Predicate<String> p1 = s -> s.length() < 5;
        System.out.println(p1.test("Hello everyBody"));

        Function<String, Integer> f1 = (s) -> s.length();
        System.out.println(f1.apply("hello"));
    }
}
