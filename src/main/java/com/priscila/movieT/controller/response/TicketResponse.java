package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Sale;
import com.priscila.movieT.entity.Session;
import com.priscila.movieT.entity.Ticket;

import java.math.BigDecimal;
import java.util.UUID;

public class TicketResponse {

    private UUID id;
    private Sale sale;
    private Session session;
    private int seatNumber;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal finalPrice;


    private TicketResponse() {
    }

    public TicketResponse(UUID id, Sale sale, Session session, int seatNumber, BigDecimal price, BigDecimal discount, BigDecimal finalPrice) {
        this.id = id;
        this.sale = sale;
        this.session = session;
        this.seatNumber = seatNumber;
        this.price = price;
        this.discount = discount;
        this.finalPrice = finalPrice;
    }

    public static TicketResponse valueOf(Ticket ticket){
        return new TicketResponse(ticket.getId(), ticket.getSale(), ticket.getSession(), ticket.getSeatNumber(), ticket.getPrice(), ticket.getDiscount(), ticket.getFinalPrice());

    }

    public static TicketResponse getEmptyTicketResponse(){
        return new TicketResponse();
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
}
