public interface Prey {
    void runAndHide();

    default void run() {
        System.out.println("prey is running");
    }
}
