public class Person {

    // default
    String name;

    private String secret;

    protected String lastName;

    // default
    void sayHi() {
        System.out.println("Hello " + name + "!");
    }

    private void tellSecret() {
        System.out.println("the secret is: " + secret);
    }

    protected void printLastName() {
        System.out.println("last name : " + lastName);
    }
}
