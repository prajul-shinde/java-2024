package Exercises.Exercise5;

public class PassObjectToMethod {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Jhon";
        p.age = 25;
        System.out.println("Before: " + p.name + " " + p.age);
        updatePerson(p);
        System.out.println("After: " + p.name + " " + p.age);
    }

    private static void updatePerson(Person p) {
        p.name = "Jane";
        p.age = 28;
    }
}
