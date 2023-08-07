package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Client client;
    private UUID paymentId;
    private double totalPrice;

}
