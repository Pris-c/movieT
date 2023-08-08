package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.SessionRequest;
import com.priscila.movieT.controller.response.SessionResponse;
import com.priscila.movieT.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sessions")
public class SessionController {

    @Autowired
    SessionService sessionService;

    @PostMapping
    public SessionResponse create(@RequestBody SessionRequest sessionRequest){
        var session = sessionRequest.getSession();
        session = sessionService.create(session);

        if (session.getId() == null){
            return SessionResponse.getEmptySessionResponse();
        }

        return SessionResponse.valueOf(session);
    }

}
