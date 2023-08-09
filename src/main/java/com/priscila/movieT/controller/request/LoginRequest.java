package com.priscila.movieT.controller.request;

import com.priscila.movieT.entity.Login;

import java.time.LocalDateTime;

public class LoginRequest {

    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;

    public Login getLogin(){
        return new Login(this.username, this.email, this.password, this.createdAt);
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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
