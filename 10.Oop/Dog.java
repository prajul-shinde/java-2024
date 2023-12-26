public class Dog extends Animal {

    // hiding
    public static String type = "Dog";

    // overriding

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // overloading
    public void eat(String food) {
        System.out.println("dog is eating " + food);
    }

}
