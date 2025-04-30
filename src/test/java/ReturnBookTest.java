
import org.example.Book;
import org.example.Library;
import org.example.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ReturnBookTest {
    @Test
    public void returnBookTest1() {
        Library library = new Library();
        Book book = new Book(4, "Java Concurrency", "Brian Goetz", 2006);
        Student student = new Student("S4", "Dave");
        library.addBook(book);
        library.issueBook(book, student);

        boolean result = library.returnBook(book, student);
        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void returnBookTest2() {
        Library library = new Library();
        Student student = new Student("S5", "Eve");

        boolean result = library.returnBook(null, student);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void returnBookTest3() {
        Library library = new Library();
        Book book = new Book(5, "Algorithms", "CLRS", 2009);

        boolean result = library.returnBook(book, null);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void returnBookTest4() {
        Library library = new Library();

        boolean result = library.returnBook(null, null);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }
}
