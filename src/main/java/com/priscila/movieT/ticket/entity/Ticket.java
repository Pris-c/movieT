package com.priscila.movieT.ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long saleId;
    private Long sessionId;
    private int seatNumber;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal finalPrice;

}
