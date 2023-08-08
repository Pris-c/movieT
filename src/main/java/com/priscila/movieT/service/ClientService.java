package com.priscila.movieT.service;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    LoginService loginService;

    public Client create(Client client){
        var loginClient = loginService.findById(client.getLogin().getId());
        if (loginClient.getId()==null){
            return new Client();
        }
        return clientRepository.save(client);

    }
}
