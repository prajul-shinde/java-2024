public class ExampleForEach {
    public static void main(String[] args) {
        int[] nrs = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int num : nrs) {
            sum += num;
        }
        System.out.println("sum is: " + sum);
    }

}
