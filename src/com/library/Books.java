package com.library;

public class Books {

    private String title;
    private String bookDescription;
    private int numberOfBooks;

    public Books(String title, String bookDescription, int numberOfBooks) {
        this.title = title;
        this.bookDescription = bookDescription;
        this.numberOfBooks = numberOfBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public boolean isAvailable() {
        return this.numberOfBooks > 0;
    }

}
