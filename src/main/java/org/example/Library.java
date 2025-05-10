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
        if (book != null) {
            catalog.add(book);
        }
    }

    /**
     * Issues a book to a student if available.
     * @param book    the book to issue
     * @param student the student who will borrow the book
     * @return true if the book was successfully issued ,  else false
     */
    public boolean issueBook(Book book, Student student) {
        if (book == null || student == null || !catalog.contains(book)) return false;
        else {
            issuedBooks.add(new IssuedBook(book, student, java.time.LocalDate.now()));
            return true;
        }
    }

    /**
     * Returns a book that was previously issued to a student.
     * @param book    the book to return
     * @param student the student returning the book
     * @return true if the return was successful, else false
     */
    public boolean returnBook(Book book, Student student) {
        if (book == null || student == null) return false;
        for (int i = 0; i < issuedBooks.size(); i++) {
            IssuedBook record = issuedBooks.get(i);
            if (record.getBook().equals(book) && record.getStudent().equals(student)) {
                issuedBooks.remove(i);
                return true;
            }
        }
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
        if (keyword == null) return new ArrayList<>();

        return catalog.stream()
                .filter(book ->
                        book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                                book.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}

