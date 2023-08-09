package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String name;
    private int seats;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @Deprecated
    public Room() {
    }

    public Room(Type type, String name, int seats, LocalDateTime createdAt) {
        this.type = type;
        this.name = name;
        this.seats = seats;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public enum Type{
        STANDARD, PREMIUM
    }

}
