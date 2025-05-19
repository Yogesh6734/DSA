package com.hotelbooking;

public abstract class HotelRooms implements Hotel {
    private String roomNumber;
    private int roomCapacity;
    private int pricePerNight;
    private int nightStayed;
    private boolean booked;

    public HotelRooms(int roomCapacity,int pricePerNight){
        this.pricePerNight=pricePerNight;
        this.roomCapacity=roomCapacity;
        this.booked=false;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNightStayed() {
        return nightStayed;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book(int nights) {
        this.nightStayed = nights;
        this.booked = true;
    }

    public double calculateBill() {
        double total = nightStayed * pricePerNight;
        return total - calculateDiscount(total);
    }

    protected abstract double calculateDiscount(double total);

}
