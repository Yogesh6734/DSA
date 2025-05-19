package com.oops;

public class Cars extends Vehicle{
    static int rentPerDay=20;
    public Cars(String vehicleNumber,String brandName, int parkDays){
        super(vehicleNumber,brandName,parkDays,rentPerDay);
    }
}
