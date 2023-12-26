public class ExampleStringEquality {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";

        System.out.println(s1 == s2); // true

        String s3 = "hi";
        String s4 = new String("hi");
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
    }
}
