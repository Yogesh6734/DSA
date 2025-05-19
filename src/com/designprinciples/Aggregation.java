package com.designprinciples;

//Definition: Aggregation is a "has-a" relationship where one object contains
// or references another, but the lifecycle of the contained object is
// independent of the container. It represents a weak ownership.
//
//        Real-World Example:
// A library has books. Books can exist without the library
// (e.g., they could belong to another library or a personal collection).
//        Analogy:
//A university has departments, but departments can exist independently.


import java.util.Arrays;
// Library and Book have an aggregation relationship.
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
      int min=  Integer.MAX_VALUE;
    }
}



public class Aggregation {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");

        Library library = new Library("City Library", Arrays.asList(book1, book2));

        library.showBooks();
        // Output:
        // Books in City Library:
        // The Great Gatsby
        // 1984
    }
}