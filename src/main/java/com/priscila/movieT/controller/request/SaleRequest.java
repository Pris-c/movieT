package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Payment;
import com.priscila.movieT.entity.Sale;

import java.math.BigDecimal;
import java.util.UUID;

public class SaleRequest {

    private Client client;
    private Payment payment;
    private BigDecimal totalPrice;

    public Sale getSale(){
        return new Sale(this.client, this.payment, this.totalPrice);
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
