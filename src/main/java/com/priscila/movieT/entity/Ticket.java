package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private Sale sale;
    @ManyToOne
    private Session session;
    private int seatNumber;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal finalPrice;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Deprecated
    public Ticket() {
    }

    public Ticket(Sale sale, Session session, int seatNumber, BigDecimal price, BigDecimal discount, LocalDateTime createdAt) {
        this.sale = sale;
        this.session = session;
        this.seatNumber = seatNumber;
        this.price = price;
        this.discount = discount;
        this.finalPrice = price.multiply(discount);
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public Sale getSale() {
        return sale;
    }

    public Session getSession() {
        return session;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
