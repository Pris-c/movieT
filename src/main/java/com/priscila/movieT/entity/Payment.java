package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime dateTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Deprecated
    public Payment() {
    }

    public Payment(Type type, Status status, LocalDateTime dateTime, LocalDateTime createdAt) {
        this.type = type;
        this.status = status;
        this.dateTime = dateTime;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public enum Status{
        AGUARDANDO_CONFIRMACAO, CONFIRMADO, RECUSADO, CANCELADO
    }

    public enum Type{
        CARTAO_CREDITO, CARTAO_DEBITO, MB_WAY, DINHEIRO
    }

}
