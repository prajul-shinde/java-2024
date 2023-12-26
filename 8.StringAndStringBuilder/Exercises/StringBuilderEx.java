package Exercises;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        // comparing
        System.out.println(sb1.equals(sb2));

        // concat
        sb1.append(sb2);
        System.out.println("after concat: " + sb1);

        // reverse
        System.out.println(" reverse: " + sb1.reverse());

        System.out.println(sb1);
    }
}
