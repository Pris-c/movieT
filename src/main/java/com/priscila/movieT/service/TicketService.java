package com.priscila.movieT.service;

import com.priscila.movieT.entity.Ticket;
import com.priscila.movieT.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    SaleService saleService;

    @Autowired
    SessionService sessionService;

    public Ticket create(Ticket ticket){
        var sale = saleService.findById(ticket.getSale().getId());
        var session = sessionService.findById(ticket.getSession().getId());

        if (sale.getId()==null || session.getId()==null){
            return new Ticket();
        }

        return ticketRepository.save(ticket);
    }
}
