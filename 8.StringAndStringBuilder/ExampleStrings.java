public class ExampleStrings {
    public static void main(String[] args) {
        String str = "Hi all!";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("all"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 5));
        System.out.println(str.toUpperCase() + " " + str.toLowerCase());
        System.out.println("   bla bla bla    ".trim());
    }
}
