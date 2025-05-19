package com.hotelbooking;

public class Main {

    public static void main(String[] args) {
        RoomManager manager = new RoomManager();

        for (int i = 0; i < 6; i++) {
            HotelRooms room = manager.bookRoom(RoomType.SINGLE, 5);
            if (room != null) {
                Customer customer = new Customer("Customer" + i, 1000 + i, room);
                customer.displayDetails();
                System.out.println();
            } else {
                System.out.println("No more SINGLE rooms available.\n");
            }
        }
    }
}
