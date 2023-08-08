package com.priscila.movieT.service;

import com.priscila.movieT.entity.Client;
import com.priscila.movieT.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    LoginService loginService;

    public Client create(Client client){
        var login = loginService.findById(client.getLogin().getId());
        if (login.getId()==null){
            return new Client();
        }
        return clientRepository.save(client);
    }

    public Client findById(UUID cliendId){
        Optional<Client> optionalClient = clientRepository.findById(cliendId);
        return optionalClient.orElse(new Client());
    }
}
