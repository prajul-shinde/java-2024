package Exercises.Exercise3;

public class PredictOutput {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "john";
        person.age = 25;
        System.out.println("Before: " + person.name + " " + person.age);
        updatePerson(person);
        System.out.println("After: " + person.name + " " + person.age);

    }

    private static void updatePerson(Person person) {
        person.name = "Jane";
        person.age = 30;
    }
}
