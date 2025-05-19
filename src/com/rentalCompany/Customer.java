package com.rentalCompany;

import com.oops.Vehicle;

public class Customer{
    private String customerName;
    private RentedVehicle vehicleRented;
    Customer(String customerName, RentedVehicle vehicleRented){
        this.customerName=customerName;
        this.vehicleRented=vehicleRented;
    }

    public RentedVehicle getVehicleRented() {
        return vehicleRented;
    }

    public String getCustomerName() {
        return customerName;
    }
}
