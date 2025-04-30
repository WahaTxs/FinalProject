package org.example;

import java.time.LocalDate;

public class IssuedBook {
    private Book book;
    private Student student;
    private LocalDate dateIssued;

    public IssuedBook(Book book, Student student, LocalDate dateIssued) {
        this.book = book;
        this.student = student;
        this.dateIssued = dateIssued;
    }

    public Book getBook() { return book; }
    public Student getStudent() { return student; }
    public LocalDate getDateIssued() { return dateIssued; }
}
