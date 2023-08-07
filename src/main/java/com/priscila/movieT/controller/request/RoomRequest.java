package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Room;
public class RoomRequest {

    private enum Type{
        STANDARD, PREMIUM
    }

    private Type type;
    private int seats;



    public Room getRoom(){
        return new Room(Room.Type.valueOf(this.type.toString()), this.seats);
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
