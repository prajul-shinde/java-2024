package Exercises;

public class Ex6CalulateSum {
    public static void main(String[] args) {
        int[] numbers = { 4, 7, 12, 5, 8 };
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("sum is " + sum);
    }
}
