import org.example.Book;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BorrowTest {
    @Test
    public void borrowTest1() {
        Student student = new Student("S1", "Alice");
        Book book = new Book(1, "Clean Code", "Robert C. Martin", 2008);

        boolean result = student.borrow(book);
        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void borrowTest2() {
        Student student = new Student("S2", "Bob");

        boolean result = student.borrow(null);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void borrowTest3() {
        Student student = new Student("S3", "Carol");
        Book book = new Book(3, "Effective Java", "Joshua Bloch", 2018);
        student.borrow(book);

        boolean result = student.borrow(book);
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void borrowTest4() {
        Student student = new Student("S4", "Dave");
        Book book1 = new Book(4, "Refactoring", "Martin Fowler", 2012);
        Book book2 = new Book(5, "TDD", "Kent Beck", 2003);

        student.borrow(book1);
        boolean result = student.borrow(book2);
        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }
}
