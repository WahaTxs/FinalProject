import org.example.Book;
import org.example.Library;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IssueBookTest {
    @Test
    public void issueBookTest1() {
        Library library = new Library();
        Book book = new Book(1, "Clean Code", "Robert C. Martin", 2008);
        Student student = new Student("S1", "Alice");
        library.addBook(book);

        boolean result = library.issueBook(book, student);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void issueBookTest2() {
        Library library = new Library();
        Book book = new Book(2, "Unknown Book", "No Author", 2020);
        Student student = new Student("S2", "Bob");

        boolean result = library.issueBook(book, student);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void issueBookTest3() {
        Library library = new Library();
        Book book = new Book(3, "Refactoring", "Martin Fowler", 2012);
        library.addBook(book);

        boolean result = library.issueBook(book, null);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }
}
