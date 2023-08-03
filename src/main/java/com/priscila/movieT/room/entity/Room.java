package com.priscila.movieT.room.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Room {

    private enum Type{
        STANDARD, PREMIUM
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;
    private ArrayList<Integer> seats;


}
