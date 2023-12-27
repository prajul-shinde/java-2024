public class Fox extends Mammal implements Predator, Prey {

    @Override
    public void catchAndEat() {
        System.out.println("Fox is catching and eating prey..");
    }

    @Override
    public void runAndHide() {
        System.out.println("Fox is running and hiding from predator..");
    }

    @Override
    public void run() {
        System.out.println("for is running");
    }
}
