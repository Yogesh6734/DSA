package com.hotelbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomManager {
    private final Map<RoomType, List<HotelRooms>> rooms = new HashMap<>();
    private final Map<RoomType, Integer> counters = new HashMap<>();

    public RoomManager() {
        rooms.put(RoomType.SINGLE, new ArrayList<>());
        rooms.put(RoomType.DOUBLE, new ArrayList<>());
        rooms.put(RoomType.SUITE, new ArrayList<>());
        counters.put(RoomType.SINGLE, 0);
        counters.put(RoomType.DOUBLE, 0);
        counters.put(RoomType.SUITE, 0);

        // Initial room creation (5 of each)
        for (int i = 0; i < 5; i++) {
            rooms.get(RoomType.SINGLE).add(new SingleRoom());
            rooms.get(RoomType.DOUBLE).add(new DoubleRoom());
            rooms.get(RoomType.SUITE).add(new SuiteRoom());
        }
    }

    public HotelRooms bookRoom(RoomType type, int nights) {
        List<HotelRooms> roomList = rooms.get(type);
        for (int i = 0; i < roomList.size(); i++) {
            HotelRooms room = roomList.get(i);
            if (!room.isBooked()) {
                room.book(nights);
                int count = counters.get(type);
                room.setRoomNumber(type.name().substring(0, 2) + count);
                counters.put(type, count + 1);
                return room;
            }
        }
        return null;
    }
}


