package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Payment;
import java.time.LocalDateTime;

public class PaymentRequest {

    private enum Status{
        AGUARDANDO_CONFIRMACAO, CONFIRMADO, RECUSADO, CANCELADO
    }

    private enum Type{
        CARTAO_CREDITO, CARTAO_DEBITO, MB_WAY, DINHEIRO
    }

    private Type type;
    private Status status;
    private LocalDateTime dateTime;

    public Payment getPayment(){
        return new Payment(Payment.Type.valueOf(this.type.toString()),
                Payment.Status.valueOf(this.status.toString()), this.dateTime);
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
