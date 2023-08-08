package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Movie;
import com.priscila.movieT.entity.Room;
import com.priscila.movieT.entity.Session;

import java.time.LocalDateTime;
import java.util.UUID;

public class SessionResponse {

    private UUID id;
    private Movie movie;
    private Room room;
    private LocalDateTime dateTime;

    private SessionResponse() {
    }

    private SessionResponse(UUID id, Movie movie, Room room, LocalDateTime dateTime) {
        this.id = id;
        this.movie = movie;
        this.room = room;
        this.dateTime = dateTime;
    }

    public static SessionResponse valueOf(Session session){
        return new SessionResponse(session.getId(), session.getMovie(), session.getRoom(), session.getDateTime());
    }

    public static SessionResponse getEmptySession(){
        return new SessionResponse();
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
}
