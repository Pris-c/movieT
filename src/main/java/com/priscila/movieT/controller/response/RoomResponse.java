package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Room;

import java.util.UUID;

public class RoomResponse {

    private UUID id;
    private Type type;
    private int seats;

    private RoomResponse(UUID id, Type type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    public static RoomResponse valueOf(Room room){
        return new RoomResponse(room.getId(), RoomResponse.Type.valueOf(room.getType().toString()), room.getSeats());
    }

    public UUID getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    private enum Type{
        STANDARD, PREMIUM
    }
}
