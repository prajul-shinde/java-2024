public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Person p = person;
        person.name = "Maaike"; // also changes p object so mutable. original object changed.
        System.out.println(p.name);
    }
}
