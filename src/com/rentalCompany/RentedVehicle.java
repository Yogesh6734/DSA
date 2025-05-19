package com.rentalCompany;

public abstract class RentedVehicle implements Rentable {

    private String vehicleNumber;
    private int rentedDays;

    public RentedVehicle(String vehicleNumber, int rentedDays){
        this.rentedDays=rentedDays;
        this.vehicleNumber=vehicleNumber;
    }
    public void displayDetails(String customerName){
        System.out.println("Hi "+customerName+" you have rented a "+this.getClass().getSimpleName() +"("+ vehicleNumber + ") for "+rentedDays +" days.");
    }

    public int getRentedDays() {
        return rentedDays;
    }
}
