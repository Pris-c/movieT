package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Movie;
public class MovieRequest {

    private String title;
    private int duration;
    private Category category;
    private AgeLimit ageLimit;

    public Movie getMovie(){
        return new Movie(this.title, this.duration, Movie.Category.valueOf(
                this.category.toString()), Movie.AgeLimit.valueOf(this.ageLimit.toString())
                );
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAgeLimit(AgeLimit ageLimit) {
        this.ageLimit = ageLimit;
    }

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
}
