package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Payment {

    public enum Status{
        AGUARDANDO_CONFIRMACAO, CONFIRMADO, RECUSADO, CANCELADO
    }

    public enum Type{
        CARTAO_CREDITO, CARTAO_DEBITO, MB_WAY, DINHEIRO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime dateTime;

    @Deprecated
    public Payment() {
    }

    public Payment(Type type, Status status, LocalDateTime dateTime) {
        this.type = type;
        this.status = status;
        this.dateTime = dateTime;
    }

    public UUID getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
