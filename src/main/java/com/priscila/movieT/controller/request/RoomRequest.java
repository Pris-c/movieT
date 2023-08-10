package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Room;

import java.time.LocalDateTime;

public class RoomRequest {

    private String name;
    private Type type;
    private int seats;


    public Room getRoom(){
        return new Room(this.name, Room.Type.valueOf(this.type.toString()), this.seats);
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

    private enum Type{
        STANDARD, PREMIUM
    }

}
