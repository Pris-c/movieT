package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Movie;
import com.priscila.movieT.entity.Room;
import com.priscila.movieT.entity.Session;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class SessionRequest {

    private Movie movie;
    private Room room;
    private LocalDateTime dateTime;

    public Session getSession(){
        return new Session(this.movie, this.room, this.dateTime);
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
