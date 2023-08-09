package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Sale;
import com.priscila.movieT.entity.Session;
import com.priscila.movieT.entity.Ticket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TicketRequest {

    private Sale sale;
    private Session session;
    private int seatNumber;
    private BigDecimal price;
    private BigDecimal discount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Ticket getTicket(){
        return new Ticket(this.sale, this.session, this.seatNumber, this.price, this.discount, this.createdAt);

    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
