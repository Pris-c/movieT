package com.priscila.movieT.client.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Client {

    private enum Type{
        PF, PJ
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long loginId;
    private String nome;
    private LocalDate dateOfBirth;
    private String type;
    private String document;

}
