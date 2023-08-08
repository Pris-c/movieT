package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.ClientRequest;
import com.priscila.movieT.controller.response.ClientResponse;
import com.priscila.movieT.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping
    public ClientResponse create(@RequestBody ClientRequest clientRequest){
        var client = clientRequest.getClient();
        client = clientService.create(client);

        if (client.getId() == null){
            return ClientResponse.getEmptyClientResponse();
        }
        return ClientResponse.valueOf(client);
    }


}
