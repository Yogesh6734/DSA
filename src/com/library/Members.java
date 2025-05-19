package com.library;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Members {

    private String memberName;
    private int memberId;
    private int fine;

    private Map<Books, LocalDate> issuedBooks;

    public Members(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.issuedBooks = new HashMap<>();
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public Map<Books, LocalDate> getIssuedBooks() {
        return issuedBooks;
    }

    public void setFine(int fine){
        this.fine=fine;
    }

    public void showDetails(){
        System.out.println("Member Name "+this.memberName);
        System.out.println("Number of books issue "+this.getIssuedBooks().size());
        System.out.println("Issued Books");
        for(Books book: issuedBooks.keySet()){
            System.out.println(book.getTitle() +" is issued by you");
        }
    }


}
