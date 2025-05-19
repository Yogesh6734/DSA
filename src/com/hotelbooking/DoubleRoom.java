package com.hotelbooking;

public class DoubleRoom extends HotelRooms {
    public DoubleRoom(){
        super(2,2200);
    }
    protected double calculateDiscount(double total) {
        int nights = getNightStayed();
        if (nights >= 5) return total * 0.20;
        if (nights >= 2) return total * 0.10;
        return 0;
    }

}
