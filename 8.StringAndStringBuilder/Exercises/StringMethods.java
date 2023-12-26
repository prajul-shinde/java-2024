package Exercises;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("length: " + str.length());
        System.out.println("upperCase: " + str.toUpperCase());
        System.out.println("loerCase: " + str.toLowerCase());
        System.out.println("subString: " + str.substring(7, 12));
        System.out.println("Replace: " + str.replace("World", "Java"));

    }
}
