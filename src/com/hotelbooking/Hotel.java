package com.hotelbooking;

public interface Hotel {
    boolean isBooked();
    void book(int nightStayed);
    double calculateBill();
    String getRoomNumber();
    int getNightStayed();
}
