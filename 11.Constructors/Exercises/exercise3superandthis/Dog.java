package Exercises.exercise3superandthis;

public class Dog extends Animal {

    private String breed;

    public Dog() {
         this("unknown" , "dog", 5);
    }

    public Dog(String breed, String species, int age) {
        super(species, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(iString breed) {
        this.breed = breed;
    }

}
