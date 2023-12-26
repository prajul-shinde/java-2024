public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = s1;
        System.out.println(s1 + " " + s2); // hi hi

        s1 = "hello";
        System.out.println(s1 + " " + s2); // hello hi

        // mutable objects

        Text t1 = new Text();
        t1.setDescription("hi");
        Text t2 = t1;

        System.out.println(t1.getDescription() + " " + t2.getDescription()); // hi hi

        t1.setDescription("Hello");

        System.out.println(t1.getDescription() + " " + t2.getDescription()); // hello hello
    }
}
