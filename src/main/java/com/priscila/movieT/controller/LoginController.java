package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.LoginRequest;
import com.priscila.movieT.controller.response.LoginResponse;
import com.priscila.movieT.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping
    public LoginResponse create(@RequestBody LoginRequest loginRequest){
        var login = loginRequest.getLogin();
        login = loginService.create(login);
        return LoginResponse.valueOf(login);
    }



}
