package com.priscila.movieT.service;

import com.priscila.movieT.entity.Sale;
import com.priscila.movieT.entity.Session;
import com.priscila.movieT.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    MovieService movieService;

    @Autowired
    RoomService roomService;

    public Session create(Session session){
        var movie = movieService.findById(session.getMovie().getId());
        var room = roomService.findById(session.getRoom().getId());
        if (room.getId()==null || movie.getId()==null){
            return new Session();
        }
        //ou usar setters
        session = new Session(movie, room, session.getDateTime());
        return sessionRepository.save(session);
    }

    public Session findById(UUID sessionId){
        Optional<Session> optionalSale = sessionRepository.findById(sessionId);
        return optionalSale.orElse(new Session());
    }

}
