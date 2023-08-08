package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Client client;
    @OneToOne
    private Payment payment;
    private BigDecimal totalPrice;

    @Deprecated
    public Sale() {
    }

    public Sale(Client client, Payment payment, BigDecimal totalPrice) {
        this.client = client;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public UUID getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Payment getPayment() {
        return payment;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
