package org.example;

public class ReferenceBook extends Book {
    private String subject;

    public ReferenceBook(int SN, String title, String author, int year, String subject) {
        super(SN, title, author, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

