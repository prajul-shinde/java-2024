package Exercises;

public class Rectangle implements Drawable, Countable {

    @Override
    public void printInfo() {
        System.out.println("Rectangle info");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

}
