package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Payment;
import com.priscila.movieT.entity.Sale;

import java.math.BigDecimal;
import java.util.UUID;

public class SaleResponse {

    private UUID id;
    private Client client;
    private Payment payment;
    private BigDecimal totalPrice;

    private SaleResponse() {
    }

    private SaleResponse(UUID id, Client client, Payment payment, BigDecimal totalPrice) {
        this.id = id;
        this.client = client;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public static SaleResponse valueOf(Sale sale){
        return new SaleResponse(sale.getId(), sale.getClient(), sale.getPayment(), sale.getTotalPrice());
    }

    public static SaleResponse getEmptySale(){
        return new SaleResponse();
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
