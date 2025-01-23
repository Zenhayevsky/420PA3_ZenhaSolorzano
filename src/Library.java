import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book book) {
        for (Book b : books) {
            if (book.getTitle().equals(b.getTitle())) {
                System.out.println("A book already exists");
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return true;
            }
        }
        System.out.println("Book not found in the library.");
        return false;
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
