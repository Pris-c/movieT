package com.priscila.movieT.service;

import com.priscila.movieT.controller.response.SessionResponse;
import com.priscila.movieT.entity.Session;
import com.priscila.movieT.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    MovieService movieService;

    @Autowired
    RoomService roomService;

    public Session create(Session session){
        var idMovie = movieService.findById(session.getMovie().getId());
        var idRoom = roomService.findById(session.getRoom().getId());
        if (idRoom.getId()==null || idMovie.getId()==null){
            return new Session();
        }

        return sessionRepository.save(session);
    }
}
