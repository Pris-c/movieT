package com.priscila.movieT.service;

import com.priscila.movieT.repository.MovieRepository;
import com.priscila.movieT.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie create(Movie movie){
        List<Movie> movies = movieRepository.findByTitle(movie.getTitle());
        if (!movies.isEmpty()){
            return new Movie();
        }
        return movieRepository.save(movie);
    }

    public Movie findById(UUID movieId){
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);
        return optionalMovie.orElse(new Movie());
    }

}
