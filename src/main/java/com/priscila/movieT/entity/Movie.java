package com.priscila.movieT.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private int duration;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private AgeLimit ageLimit;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @Deprecated
    public Movie() {
    }

    public Movie(String title, int duration, Category category, AgeLimit ageLimit) {
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.ageLimit = ageLimit;
        this.createdAt = LocalDateTime.now(ZoneId.of("+00:00"));
        this.updatedAt = LocalDateTime.now(ZoneId.of("+00:00"));
    }


    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Category getCategory() {
        return category;
    }

    public AgeLimit getAgeLimit() {
        return ageLimit;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


    public enum Category {
        ACAO, AVENTURA, COMEDIA, DRAMA, TERROR, ROMANCE, FICCAO_CIENTIFICA, FANTASIA, HISTORICO
    }

    public enum AgeLimit {
        AGE_12(12), AGE_14(14), AGE_16(14), AGE_18(18);

        public int age;
        AgeLimit(int age) {
            this.age = age;
        }
    }
}
