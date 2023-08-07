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

    @Deprecated
    public Sale() {
    }

    public Sale(Client client, UUID paymentId, double totalPrice) {
        this.client = client;
        this.paymentId = paymentId;
        this.totalPrice = totalPrice;
    }
}
