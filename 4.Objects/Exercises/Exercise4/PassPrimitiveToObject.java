package Exercises.Exercise4;

public class PassPrimitiveToObject {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before: " + number);
        modifyNumber(number);
        System.out.println("After: " + number);
    }

    private static void modifyNumber(int number) {
        number = number * 2;
    }
}
