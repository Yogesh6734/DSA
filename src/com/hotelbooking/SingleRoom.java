package com.hotelbooking;

public class SingleRoom extends HotelRooms {
    public SingleRoom(){
            super(1,1200);
    }

    @Override
    protected double calculateDiscount(double total) {
        int nights = getNightStayed();
        if (nights >= 6) return total * 0.25;
        if (nights >= 2) return total * 0.15;
        return 0;
    }
}
