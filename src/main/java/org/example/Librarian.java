package org.example;

public class Librarian extends User {
    private Library library;

    public Librarian(String id, String name, Library library) {
        super(id, name);
        this.library = library;
    }

    /**
     * Adds a book to the library catalog.
     *
     * @param book the book to add
     */
    public void addBook(Book book) {
        library.addBook(book);
    }

    /**
     * Issues a book to a student.
     *
     * @param book    the book to issue
     * @param student the student to issue the book to
     * @return true if issuing succeeded,else false
     */
    public boolean issueBook(Book book, Student student) {
        return library.issueBook(book,student);
    }

    /**
     * Returns a book from a student.
     *
     * @param book    the book being returned
     * @param student the student returning the book
     * @return true if return succeeded,else false
     */
    public boolean returnBook(Book book, Student student) {
        return library.returnBook(book,student);
    }

    /**
     * Displays the interaction interface for the librarian.
     */
    @Override
    public void interact() {
        System.out.println("Librarian interface for " + name);
    }
}
