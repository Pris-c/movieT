package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Room {

    public enum Type{
        STANDARD, PREMIUM
    }

    @Deprecated
    public Room() {
    }

    public Room(Type type, int seats) {
        this.type = type;
        this.seats = seats;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int seats;

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
