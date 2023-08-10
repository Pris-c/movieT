package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private Login login;
    private String nome;
    private LocalDate dateOfBirth;
    private Type type;
    private String document;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;



    @Deprecated
    public Client() {
    }

    public Client(Login login, String nome, LocalDate dateOfBirth, Type type, String document, LocalDateTime createdAt) {
        this.login = login;
        this.nome = nome;
        this.dateOfBirth = dateOfBirth;
        this.type = type;
        this.document = document;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }


    public UUID getId() {
        return id;
    }

    public Login getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Type getType() {
        return type;
    }

    public String getDocument() {
        return document;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


    public enum Type{
        PF, PJ
    }







}
