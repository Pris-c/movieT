package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Room room;
    private LocalDateTime dateTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Deprecated
    public Session() {
    }

    public Session(Movie movie, Room room, LocalDateTime dateTime, LocalDateTime createdAt) {
        this.movie = movie;
        this.room = room;
        this.dateTime = dateTime;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
