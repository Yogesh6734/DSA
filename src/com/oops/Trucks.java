package com.oops;

public class Trucks extends Vehicle {
    static int rentPerDay=40;
    public Trucks(String vehicleNumber,String brandName, int parkDays){
        super(vehicleNumber,brandName,parkDays,rentPerDay);
    }
}
