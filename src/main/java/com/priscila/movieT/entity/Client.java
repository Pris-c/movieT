package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
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

    @Deprecated
    public Client() {
    }

    public Client(Login login, String nome, LocalDate dateOfBirth, Type type, String document) {
        this.login = login;
        this.nome = nome;
        this.dateOfBirth = dateOfBirth;
        this.type = type;
        this.document = document;
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

    public enum Type{
        PF, PJ
    }







}
