package Exercises.Exercise2;

public class ObjectWithObjects {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "bmw";

        Owner owner = new Owner();
        owner.name = "John";

        car.owner = owner;

        System.out.println("Car model: " + car.model);
        System.out.println("Owner: " + car.owner.name);
    }
}
