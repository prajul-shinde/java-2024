public interface Predator {

    void catchAndEat();

    default void eat(Prey p) {
        System.out.println("Eating: " + p.getClass().getName());
    }

    default void run() {
        System.out.println("predator is running");
    }
}
