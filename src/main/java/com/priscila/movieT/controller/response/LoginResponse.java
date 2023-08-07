package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Login;

import java.util.UUID;

public class LoginResponse {

    private UUID id;
    private String username;
    private String email;
    private String password;

    private LoginResponse(UUID id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static LoginResponse valueOf(Login login){
        return new LoginResponse(login.getId(), login.getUsername(), login.getEmail(), login.getPassword());
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
