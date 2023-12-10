public class ExampleString {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hello";
        System.out.println(s.equals(s1));

        System.out.println(s.toUpperCase());
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String subString = s1.substring(1, 4);
        System.out.println("subString = " + subString);

        System.out.println("startsWith " + s1.startsWith("h"));
        System.out.println("length " + s1.length());
        System.out.println(s1.charAt(3));

        String multi = """
                hi. t his is multiline string.
                won't work before java 13.
                """;
        System.out.println(multi);
    }
}
