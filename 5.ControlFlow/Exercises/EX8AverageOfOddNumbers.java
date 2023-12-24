package Exercises;

public class EX8AverageOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers = { 4, 7, 12, 5, 8 };
        int count = 0;
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        System.out.println("average of odd numbers are " + (sum / count));
    }
}
