package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Room;

import java.time.LocalDateTime;
import java.util.UUID;

public class RoomResponse {

    private UUID id;
    private String name;
    private Type type;
    private int seats;
    private LocalDateTime createdAt;


    private RoomResponse() {
    }

    private RoomResponse(UUID id, String name, Type type, int seats, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.createdAt = createdAt;
    }

    public static RoomResponse valueOf(Room room){
        return new RoomResponse(room.getId(), room.getName(), RoomResponse.Type.valueOf(room.getType().toString()), room.getSeats(), room.getCreatedAt());
    }

    public static RoomResponse getEmptyRoomResponse(){
        return new RoomResponse();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    private enum Type{
        STANDARD, PREMIUM
    }

}
