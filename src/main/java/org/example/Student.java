package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Book> borrowedBooks;

    public Student(String id, String name) {
        super(id, name);
        borrowedBooks = new ArrayList<>();
    }
    /**
     * Allows student to borrow a book.
     * @param book the book to borrow
     * @return true if the book was borrowed successfully,else otherwise
     */
    public boolean borrow(Book book) {
        return false;
    }
    /**
     * Allows the student to return a borrowed book.
     * @param book the book to return
     * @return true if the return was successful, else otherwise
     */
    public boolean returnBook(Book book) {
        return false;
    }
    /**
     * Displays the interaction interface for the student.
     */
    @Override
    public void interact() {
        System.out.println("Student interface");
    }
}

