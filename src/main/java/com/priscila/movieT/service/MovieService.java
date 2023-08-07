package com.priscila.movieT.service;

import com.priscila.movieT.repository.MovieRepository;
import com.priscila.movieT.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie create(Movie movie){
        return movieRepository.save(movie);
    }

}
