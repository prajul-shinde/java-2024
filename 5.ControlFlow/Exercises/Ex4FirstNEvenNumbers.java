package Exercises;

public class Ex4FirstNEvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        int counter = 0;
        while (counter < n) {
            if (i % 2 == 0) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }
}
