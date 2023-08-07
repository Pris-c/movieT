package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Login;

public class LoginRequest {

    private String username;
    private String email;
    private String password;

    public Login getLogin(){
        return new Login(this.username, this.email, this.password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
