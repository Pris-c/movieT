package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Payment;
import com.priscila.movieT.entity.Sale;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class SaleRequest {

    private Client client;
    private Payment payment;
    private BigDecimal totalPrice;
    private LocalDateTime createdAt;

    public Sale getSale(){
        return new Sale(this.client, this.payment, this.totalPrice, this.createdAt);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
