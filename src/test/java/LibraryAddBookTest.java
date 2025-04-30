import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryAddBookTest {

    @Test
    public void addBookTest1() {
        Library library = new Library();

        Book book1 = new Book(1, "Clean Code", "Robert C. Martin", 2008);
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch", 2017);

        library.addBook(book1);
        library.addBook(book2);

        int expected = 2;
        int result = library.viewCatalog().size();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void addBookTest2() {
        Library library = new Library();

        int expected = 0;
        int result = library.viewCatalog().size();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void addBookTest3() {
        Library library = new Library();
        library.addBook(null);

        int expected = 0;
        int result = library.viewCatalog().size();

        Assertions.assertEquals(expected, result);
    }
}
