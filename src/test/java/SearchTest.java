import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchTest {

    @Test
    public void searchTest1() {
        Library library = new Library();

        List<Book> result = library.search("Java");
        List<Book> expected = new ArrayList<>();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void searchTest2() {
        Library library = new Library();

        List<Book> result = library.search(null);
        List<Book> expected = new ArrayList<>();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void searchTest3() {
        Library library = new Library();
        Book book = new Book(6, "Java 101", "Jane Doe", 2010);
        library.addBook(book);

        List<Book> expected = new ArrayList<>();
        expected.add(book);

        List<Book> result = library.search("Java 101");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void searchTest4() {
        Library library = new Library();
        Book book = new Book(7, "Python Basics", "John Smith", 2015);
        library.addBook(book);

        List<Book> expected = new ArrayList<>();
        expected.add(book);

        List<Book> result = library.search("python basics");

        Assertions.assertEquals(expected, result);
    }
}
