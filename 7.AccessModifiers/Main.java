import staticaccess.MathUtils;

public class Main {
    public static void main(String[] args) {
        var p = new Person();
        p.name = "maria";
        p.sayHi();

        // p.secret = "we cannot access it its private."

        System.out.println(MathUtils.pi);
        System.out.println(MathUtils.subtract(4, 3));
    }
}
