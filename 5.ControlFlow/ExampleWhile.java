public class ExampleWhile {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound) {
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("value: " + randomNumber);
            if (randomNumber == 10)
                notFound = false;
        }
    }
}
