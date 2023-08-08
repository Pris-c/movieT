package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Payment;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentResponse {

    private UUID id;
    private Payment.Type type;
    private Payment.Status status;
    private LocalDateTime dateTime;

    private PaymentResponse(UUID id, Payment.Type type, Payment.Status status, LocalDateTime dateTime) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.dateTime = dateTime;
    }

    public static PaymentResponse valueOf(Payment payment){
        return new PaymentResponse(payment.getId(), Payment.Type.valueOf(payment.getType().toString()),
                Payment.Status.valueOf(payment.getStatus().toString()),payment.getDateTime());
    }


    public UUID getId() {
        return id;
    }

    public Payment.Type getType() {
        return type;
    }

    public Payment.Status getStatus() {
        return status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }


    public enum Status{
        AGUARDANDO_CONFIRMACAO, CONFIRMADO, RECUSADO, CANCELADO
    }

    public enum Type{
        CARTAO_CREDITO, CARTAO_DEBITO, MB_WAY, DINHEIRO
    }


}
