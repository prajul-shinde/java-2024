public class ExampleOperators {
    public static void main(String[] args) {
        // Arithmatic Operators
        double x = 2;
        double y = 3;
        System.out.println("x+y = " + (x + y));
        System.out.println("x/y = " + (double) (x / y));

        int nr1 = 10;
        int nr2 = 4;
        System.out.println("x%y = " + (x % y));

        // Assignment Operators
        int nr3 = 7;
        int nr4 = 70;
        nr3 += nr4;
        System.out.println(nr3);

        // Unary operators
        int nr5 = 8;
        nr5++;
        System.out.println(nr5);

        int nr6 = 6;
        System.out.println(-nr6);
        System.out.println(nr6); // 6

        int pre = 5;
        int post = 5;
        // pre first updates before assign post updates later
        System.out.println(++pre); // 6
        System.out.println(post++); // 5

        // Relational Operators
        int small = 2;
        int big = 10;
        System.out.println(small == big);
        System.out.println(small != big);
        System.out.println(small >= big);
        System.out.println(small > big);

    }
}
