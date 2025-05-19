package com.rentalCompany;

import com.oops.Vehicle;

public class Bikes extends RentedVehicle {
    static final int DISCOUNT_DAY_2= 15;
    static final int DISCOUNT_DAY_5= 25;
    static final int RENT_PER_DAY= 10;

    public Bikes(String vehicleNumber, int rentedDays){
        super(vehicleNumber,rentedDays);
    }

    public double calculateRent() {
        double discount;
        int days=getRentedDays();
        int totalRent= RENT_PER_DAY * days;
        switch (days) {
            case 1:
                return totalRent;
            case 2,3,4:
                discount = calculateDiscount(totalRent, DISCOUNT_DAY_2);
                return totalRent-discount;
            default:
                discount = calculateDiscount(totalRent, DISCOUNT_DAY_5);
                return totalRent-discount;
        }
    }
}
