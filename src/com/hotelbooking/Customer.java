package com.hotelbooking;

public class Customer {
    private HotelRooms hotelRoom;
    private String customerName;
    private int customerID;
    static int roomNumber;
    public Customer(String customerName, int customerID,HotelRooms hotelRoom ){
        this.hotelRoom=hotelRoom;
        this.customerID=customerID;
        this.customerName=customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public HotelRooms getHotelRoom(){
        return hotelRoom;
    }

    public int getCustomerID() {
        return customerID;
    }


    public void displayDetails(){
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Room Type: "+ hotelRoom.getClass().getSimpleName());
        System.out.println("Room Number: "+ hotelRoom.getRoomNumber());
        System.out.println("Night Stayed: "+ hotelRoom.getNightStayed());
        System.out.println("Final Bill: "+ hotelRoom.calculateBill());
    }




}
