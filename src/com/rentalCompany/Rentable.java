package com.rentalCompany;

public interface Rentable {
    double calculateRent();
    void displayDetails(String customerName);
    default double calculateDiscount(int totalRent, int discount){
       return (double)((totalRent*discount)/100);
    }
}
