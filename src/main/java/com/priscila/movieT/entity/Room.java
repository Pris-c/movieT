package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
public class Room {

    public enum Type{
        STANDARD, PREMIUM
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int seats;


    @Deprecated
    public Room() {
    }

    public Room(Type type, int seats) {
        this.type = type;
        this.seats = seats;
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
}
