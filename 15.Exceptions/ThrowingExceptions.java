import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) throws IOException {
        divide(2, 0);
    }

    private static void divide(int i, int j) throws IOException {
        if (i == 0)
            throw new IOException("cannot divide by zero.");
        System.out.println(i / j);
    }
}
