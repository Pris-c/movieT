package com.priscila.movieT.entity;

import jakarta.persistence.*;

@Entity
public class Movie {

    private enum Category {
        ACAO, AVENTURA, COMEDIA, DRAMA, TERROR, ROMANCE, FICCAO_CIENTIFICA, FANTASIA, HISTORICO
    }

    private enum AgeLimit {
        AGE_12(12), AGE_14(14), AGE_16(14), AGE_18(18);

        public int age;
        AgeLimit(int age) {
            this.age = age;
        }

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int duration;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private AgeLimit ageLimit;

}
