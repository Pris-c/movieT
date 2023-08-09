package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.MovieRequest;
import com.priscila.movieT.controller.response.MovieResponse;
import com.priscila.movieT.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping
    public MovieResponse create(@RequestBody MovieRequest movieRequest){
        var movie = movieRequest.getMovie();
        movie = movieService.create(movie);
        if (movie.getId()==null){
            return MovieResponse.getEmptyMovieResponse();
        }
        return MovieResponse.valueOf(movie);
    }


}
