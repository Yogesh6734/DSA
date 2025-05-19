package com.hotelbooking;

public class SuiteRoom extends HotelRooms{
    public SuiteRoom() {
        super(3, 3000);
    }

    @Override
    protected double calculateDiscount(double total) {
        int nights = getNightStayed();
        if (nights >= 5) return total * 0.25;
        if (nights >= 2) return total * 0.12;
        return 0;
    }


}
