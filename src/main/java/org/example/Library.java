package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> catalog = new ArrayList<>();
    private List<IssuedBook> issuedBooks = new ArrayList<>();

    /**
     * add a new book to the catalog
     * @param book the book to be added
     */
    public void addBook(Book book) {
        catalog.add(book);
    }

    /**
     *  Issues a book to a student if available.
     * @param book the book to issue
     * @param student the student who will borrow the book
     * @return true if the book was successfully issued ,  else false
     */
    public boolean issueBook(Book book, Student student) {
        return false;
    }

    /**
     * Returns a book that was previously issued to a student.
     * @param book the book to return
     * @param student the student returning the book
     * @return true if the return was successful, else false
     */
    public boolean returnBook(Book book, Student student) {
        return false;
    }

    /**
     * Returns a list of books currently in the catalog.
     * @return list of all books in the catalog
     */
    public List<Book> viewCatalog() {
        return catalog;
    }

    /**
     * Searches the catalog for books matching the given keyword
     * @param keyword the keyword to search (title or author)
     * @return a list of books
     */
    @Override
    public List<Book> search(String keyword) {
        return new ArrayList<>();
    }
}
