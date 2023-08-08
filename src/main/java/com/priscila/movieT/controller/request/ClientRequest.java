package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.entity.Login;
import java.time.LocalDate;

public class ClientRequest {
    private Login login;
    private String nome;
    private LocalDate dateOfBirth;
    private Type type;
    private String document;


    public Client getClient(){
        return new Client(this.login, this.nome, this.dateOfBirth, Client.Type.valueOf(this.type.toString()), this.document);
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

    private enum Type{
        PF, PJ
    }

}
