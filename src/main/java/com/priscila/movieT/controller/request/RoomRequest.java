package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Room;

import java.time.LocalDateTime;

public class RoomRequest {

    private Type type;
    private int seats;
    private String name;

    private LocalDateTime createdAt;

    public Room getRoom(){
        return new Room(Room.Type.valueOf(this.type.toString()), this.name, this.seats, this.createdAt);
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    private enum Type{
        STANDARD, PREMIUM
    }

}
