public class Main {
    public static void main(String[] args) {
        GenericBag<Laptop> laptopBag = new GenericBag<>();
        Laptop laptop = new Laptop();
        laptop.setName("HP");
        laptopBag.setContent(laptop);

        GenericBag<Book> bookBag = new GenericBag<>();
        Book book = new Book();
        book.setName("to kill a mockingbird");
        bookBag.setContent(book);
    }
}
