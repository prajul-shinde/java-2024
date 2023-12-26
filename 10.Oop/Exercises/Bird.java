package Exercises;

public class Bird extends Animal {
    public Bird() {
        super("chirp");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound: " + getSound());
    }
}
