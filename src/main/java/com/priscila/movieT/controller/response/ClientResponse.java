package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Login;
import java.time.LocalDate;
import java.util.UUID;

public class ClientResponse {

    private UUID id;
    private Login login;
    private String nome;
    private LocalDate dateOfBirth;
    private Type type;
    private String document;

    private ClientResponse() {
    }

    private ClientResponse(UUID id, Login login, String nome, LocalDate dateOfBirth, Type type, String document) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.dateOfBirth = dateOfBirth;
        this.type = type;
        this.document = document;
    }


    public static ClientResponse valueOf(Client client){
        return new ClientResponse(client.getId(), client.getLogin(), client.getNome(), client.getDateOfBirth(), ClientResponse.Type.valueOf(client.getType().toString()), client.getDocument());
    }

    public static ClientResponse getEmptyClient(){
        return new ClientResponse();
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
