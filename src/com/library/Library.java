package com.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;

public class Library {
    private List<Members> membersList;
    private List<Books> booksList;

    public Library() {
        this.membersList = new ArrayList<>();
        this.booksList=new ArrayList<>();
    }

    public void addBook(Books book){
        booksList.add(book);
    }

    public void addMember(Members member){
        membersList.add(member);
    }

    public void issueBook(Books book, Members member) {
        if (book.isAvailable()) {
            book.setNumberOfBooks(book.getNumberOfBooks() - 1);
            member.getIssuedBooks().put(book, LocalDate.now()); // store issued date
        } else {
            System.out.println("Book is not available for issuing.");
        }
    }

    public void returnBook(Books book, Members member) {
        if (member.getIssuedBooks().containsKey(book)) {
            LocalDate issuedDate = member.getIssuedBooks().get(book);
            long daysBetween = ChronoUnit.DAYS.between(issuedDate, LocalDate.now());

            if (daysBetween > 15) {
                member.setFine((int)(daysBetween - 15) * 10); // Example: 10 Rs per extra day
            }

            book.setNumberOfBooks(book.getNumberOfBooks() + 1);
            member.getIssuedBooks().remove(book); // Remove from map after return
        } else {
            System.out.println("This book was not issued to the member.");
        }
    }

    public void showBookDetails(){
        System.out.println("Total Books available "+ getBooksCount());
        System.out.println("Books available");
        for(Books book: booksList){
            System.out.println(book.getTitle());
        }
    }

    public void showMembersDetails(){
        for(Members members:membersList){
            members.showDetails();
        }
    }

    public int getBooksCount(){
        int count=0;
        for(Books books: booksList){
            count+= books.getNumberOfBooks();
        }
        return count;
    }

}
