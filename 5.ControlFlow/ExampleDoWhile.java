import java.util.Scanner;

public class ExampleDoWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            do {
                System.out.println("Enter your name: ");
                input = scanner.nextLine();
            } while (input.length() < 2);
        }

    }
}
