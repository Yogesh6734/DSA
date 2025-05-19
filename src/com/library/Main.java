package com.library;

public class Main {

    public static void main(String[] args) {
        Library l1=new Library();
        Books b1= new Books("BAC","bababba",15);
        Books b2= new Books("DABRA","KABABA",10);
        Books b3= new Books("KABRA","ADADA",1);

        Members m1= new Members("Yogesh",101);
        Members m2= new Members("Lokesh",102);
        Members m3= new Members("Jatin",103);

        l1.addMember(m1);
        l1.addMember(m2);
        l1.addMember(m3);
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        l1.issueBook(b1,m2);
        m2.showDetails();
         l1.showMembersDetails();

         l1.showBookDetails();
        System.out.println(b1.getNumberOfBooks());
    }
}
