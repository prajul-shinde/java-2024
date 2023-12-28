public class WrongInputException extends Exception {

    public WrongInputException() {
        super();
    }

    public WrongInputException(String message) {
        super(message);
    }

    public WrongInputException(Exception e) {
        super(e);
    }
}
