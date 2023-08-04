package com.priscila.movieT.controller;

import com.priscila.movieT.entity.Movie;
import com.priscila.movieT.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/movie/save")
    public Movie save(){
        return movieService.save(new Movie());
    }
}
