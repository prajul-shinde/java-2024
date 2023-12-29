package exercises;

public class LambdaExample {
    public static void main(String[] args) {

        NumericOperator addition = (a, b) -> a + b;
        System.out.println(addition.operate(3, 5));

        NumericOperator maximum = (a, b) -> (a > b) ? a : b;
        System.out.println(maximum.operate(3, 5));

        StringFormatter formatter = (input) -> input.toUpperCase();
        System.out.println(formatter.format("Hello world"));

    }

}
