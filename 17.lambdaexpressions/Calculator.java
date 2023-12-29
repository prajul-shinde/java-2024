
@FunctionalInterface
public interface Calculator {

    int calculate(int a, int b);

    String toString();

    default void print() {
        System.out.println("hi");
    }
}
