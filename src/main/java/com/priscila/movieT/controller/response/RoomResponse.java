package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Room;

public class RoomResponse {
    private enum Type{
        STANDARD, PREMIUM
    }

    private Long id;
    private Type type;
    private int seats;

    private RoomResponse(Long id, Type type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    public static RoomResponse valueOf(Room room){
        return new RoomResponse(room.getId(), RoomResponse.Type.valueOf(room.getType().toString()), room.getSeats());
    }

    public Long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }
}
