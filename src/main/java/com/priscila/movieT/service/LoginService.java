package com.priscila.movieT.service;

import com.priscila.movieT.entity.Login;
import com.priscila.movieT.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public Login create(Login login){
        return loginRepository.save(login);
    }
}
