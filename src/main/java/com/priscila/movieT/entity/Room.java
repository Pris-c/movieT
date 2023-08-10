package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int seats;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @Deprecated
    public Room() {
    }

    public Room(String name, Type type, int seats) {
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.createdAt = LocalDateTime.now(ZoneId.of("+00:00"));
        this.updatedAt = LocalDateTime.now(ZoneId.of("+00:00"));
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
