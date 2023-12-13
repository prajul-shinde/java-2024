//pass by value demo
public class Pass {

    public static void main(String[] args) {
        int i = 3;
        Person p = new Person();
        p.name = "Scott";
        changeStuff(i, p);
        // i stays same name changes because copy of reference is made not object.
        // and that copy of reference refers to same object on heap.
        System.out.println(i + " " + p.name);
    }

    private static void changeStuff(int i, Person p) {
        i = 5;
        p.name = "Miley";
    }
}
