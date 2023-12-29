public class LambdaScope {
    public static void main(String[] args) {

        // effectively final
        int localVar = 6;

        // makes it not effectilvely final
        // localVar = 7;
        // (a,b) cannot be (localvar, b) because localVar is already there it wwould be
        // duplicate.
        Calculator calculator = (a, b) -> a * b + localVar;
        System.out.println(calculator.calculate(3, 5));

    }
}
