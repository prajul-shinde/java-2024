import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
 
        try (FileReader reader = new FileReader("sample.txt")) {
            // File file = new File("sample.txt");
        } catch (IOException e) {
            System.out.println("file not found");
        }
        System.out.println("Done!");
    }
}
