package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Sale;
import com.priscila.movieT.entity.Session;
import com.priscila.movieT.entity.Ticket;

import java.math.BigDecimal;

public class TicketRequest {

    private Sale sale;
    private Session session;
    private int seatNumber;
    private BigDecimal price;
    private BigDecimal discount;

    //private BigDecimal finalPrice;

    public Ticket getTicket(){
        return new Ticket(this.sale, this.session, this.seatNumber, this.price, this.discount);

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

}
