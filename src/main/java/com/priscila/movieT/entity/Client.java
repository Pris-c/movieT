package com.priscila.movieT.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Client {

    private enum Type{
        PF, PJ
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private Login login;
    private String nome;
    private LocalDate dateOfBirth;
    private String type;
    private String document;

}
