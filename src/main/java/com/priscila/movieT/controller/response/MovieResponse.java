package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Movie;

import java.util.UUID;

public class MovieResponse {
    private UUID id;
    private String title;
    private int duration;
    private Category category;
    private AgeLimit ageLimit;


    private MovieResponse(UUID id, String title, int duration, Category category, AgeLimit ageLimit) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.ageLimit = ageLimit;
    }

    public static MovieResponse valueOf(Movie movie){
        return new MovieResponse(
                movie.getId(), movie.getTitle(), movie.getDuration(),
                MovieResponse.Category.valueOf(movie.getCategory().toString()),
                MovieResponse.AgeLimit.valueOf(movie.getAgeLimit().toString()));
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
