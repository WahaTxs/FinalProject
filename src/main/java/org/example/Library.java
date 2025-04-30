package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> catalog = new ArrayList<>();
    private List<IssuedBook> issuedBooks = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public boolean issueBook(Book book, Student student) {
        return false;
    }

    public boolean returnBook(Book book, Student student) {
        return false;
    }

    public List<Book> viewCatalog() {
        return catalog;
    }

    @Override
    public List<Book> search(String keyword) {
        return new ArrayList<>();
    }
}
