package com.priscila.movieT.ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long saleId;
    private Long sessionId;
    private int seatNumber;
    private double price;
    private double discount;
    private double finalPrice;

}
