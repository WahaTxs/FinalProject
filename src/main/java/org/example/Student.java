package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Book> borrowedBooks;

    public Student(String id, String name) {
        super(id, name);
        borrowedBooks = new ArrayList<>();
    }

    public boolean borrow(Book book) {
        return false;
    }

    public boolean returnBook(Book book) {
        return false;
    }

    @Override
    public void interact() {
        System.out.println("Student interface");
    }
}

