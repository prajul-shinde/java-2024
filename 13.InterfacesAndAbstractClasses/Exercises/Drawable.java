package Exercises;

public interface Drawable {
    void draw();

    default void erase() {
        System.out.println("erasing a drawing");
    }

    default void printInfo() {
        System.out.println("Drwable info");
    }
}
