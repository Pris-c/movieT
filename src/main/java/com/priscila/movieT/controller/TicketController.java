package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.TicketRequest;
import com.priscila.movieT.controller.response.TicketResponse;
import com.priscila.movieT.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping
    public TicketResponse create(@RequestBody TicketRequest ticketRequest){
        var ticket = ticketRequest.getTicket();
        ticket = ticketService.create(ticket);

        if (ticket.getId()==null){
            return TicketResponse.getEmptyTicketResponse();
        }
        return TicketResponse.valueOf(ticket);

    }

}
