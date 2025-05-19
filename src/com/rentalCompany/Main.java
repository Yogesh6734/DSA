package com.rentalCompany;

import com.oops.Vehicle;

public class Main {

    public static void main(String[] args) {
        RentedVehicle thar= new Cars("HR87S4617",5);
        RentedVehicle ct100= new Bikes("HR87S1234",1);
        RentedVehicle sumo= new Trucks("HR87S4123",6);
        Customer yogesh= new Customer("Yogesh",thar);
        Customer pinki= new Customer("Pinki",ct100);
        Customer monu= new Customer("Monu",sumo);
        RentedVehicle rentedByMonu = monu.getVehicleRented();
        rentedByMonu.displayDetails(monu.getCustomerName());
        System.out.println(rentedByMonu.calculateRent());

        RentedVehicle rentedByPinki = pinki.getVehicleRented();
        rentedByPinki.displayDetails(pinki.getCustomerName());
        System.out.println(rentedByPinki.calculateRent());


        RentedVehicle rentedByYogesh = yogesh.getVehicleRented();
        rentedByYogesh.displayDetails(yogesh.getCustomerName());
        System.out.println(rentedByYogesh.calculateRent());
    }
}
