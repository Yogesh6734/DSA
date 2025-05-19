package com.oops;

public abstract class Vehicle {
    private String vehicleNumber;
    private String brandName;
    private int rentPerDay;
    private int parkDays;

    Vehicle(String vehicleNumber, String brandName, int parkDays, int rentPerDay){
        this.vehicleNumber=vehicleNumber;
        this.brandName=brandName;
        this.parkDays=parkDays;
        this.rentPerDay=rentPerDay;
    }
    public void displayVehicleDetails(){
        System.out.println("Vehicle Number "+vehicleNumber );
        System.out.println("Vehicle Type "+ this.getClass().getSimpleName());
        System.out.println("Brand Name "+ brandName );
    }

    public int calculateRent(){
        return rentPerDay * parkDays;
    }

}

