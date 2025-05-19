package com.oops;

public class Bikes extends Vehicle {
    static int rentPerDay=10;
    public Bikes(String vehicleNumber,String brandName, int parkDays){
        super(vehicleNumber,brandName,parkDays,rentPerDay);
    }
}
