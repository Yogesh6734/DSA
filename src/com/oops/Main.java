package com.oops;

public class Main {
    public static void main(String[] args) {
        Vehicle car1= new Cars("HR87S4617","Mahindra",2);
        Vehicle car2= new Cars("HR87S7251","Suzuki",3);
        Vehicle truck= new Trucks("HR87S1234","Tata",1);
        Vehicle bike= new Bikes("HR87S4123","Hero",1);

        System.out.println("Rent for your car is "+ car1.calculateRent());
        car2.displayVehicleDetails();
        bike.displayVehicleDetails();
        System.out.println("Rent for your truck is "+ truck.calculateRent());

    }
}
