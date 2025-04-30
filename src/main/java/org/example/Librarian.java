package org.example;

public class Librarian extends User {

    public Librarian(String id, String name) {
        super(id, name);
    }

    public void addBook(Book book) {
        // To be implemented
    }

    public boolean issueBook(Book book, Student student) {
        return false;
    }

    public boolean returnBook(Book book, Student student) {
        return false;
    }

    @Override
    public void interact() {
        System.out.println("Librarian interface");
    }
}
