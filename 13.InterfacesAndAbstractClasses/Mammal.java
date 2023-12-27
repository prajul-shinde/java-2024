public class Mammal extends Animal {

    @Override
    void breathe() {
        final int x =0;
        // x = 5;  cannot reassign value
        System.out.println("Mammal is breathing");
    }

}
