public class ExampleContinue {
    public static void main(String[] args) {
        int[] nrs = { 0, 1, 2, 3, 4 };
        for (int nr : nrs) {
            if (nr % 2 == 0)
                continue;
            System.out.println(nr);
        }
    }
}
