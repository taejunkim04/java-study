package construct.ex;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Hello java","Seo");
        Book book3 = new Book("JPA 프로그래밍","kim",700);
        Book[] books = {book1, book2, book3};
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
