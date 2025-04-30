package org.example;

public class TextBook extends Book {
    private String course;

    public TextBook(int SN, String title, String author, int year, String course) {
        super(SN, title, author, year);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
