package com.priscila.movieT.movie.service;

import com.priscila.movieT.movie.dao.MovieRepository;
import com.priscila.movieT.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie save(Movie movie){
        System.out.println("Saving movie");
        return movieRepository.save(movie);
    }

}
