package org.example;

public class Book implements Comparable<Book> {
    private int SN;
    private String title;
    private String author;
    private int year;

    public Book(int SN, String title, String author, int year) {
        this.SN = SN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getSN() { return SN; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public void setSN(int SN) { this.SN = SN; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return SN + " - " + title + " by " + author + " (" + year + ")";
    }
}