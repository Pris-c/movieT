package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Login;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClientRequest {
    private Login login;
    private String nome;
    private LocalDate dateOfBirth;
    private Type type;
    private String document;
    private LocalDateTime createdAt;


    public Client getClient(){
        return new Client(this.login, this.nome, this.dateOfBirth, Client.Type.valueOf(this.type.toString()), this.document, this.createdAt);
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private enum Type{
        PF, PJ
    }

}
