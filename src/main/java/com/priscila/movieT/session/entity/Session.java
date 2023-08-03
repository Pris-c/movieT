package com.priscila.movieT.session.entity;

import com.priscila.movieT.movie.entity.Movie;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long movieId;
    private Long roomId;
    private LocalDateTime dateTime;
    private ArrayList<Integer> seatsAvaiables;
    private int seatsSold;


}
