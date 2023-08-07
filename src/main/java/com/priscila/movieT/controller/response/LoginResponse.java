package com.priscila.movieT.controller.response;

import com.priscila.movieT.entity.Login;
public class LoginResponse {

    private Long id;
    private String username;
    private String email;
    private String password;

    public LoginResponse(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static LoginResponse valueOf(Login login){
        return new LoginResponse(login.getId(), login.getUsername(), login.getEmail(), login.getPassword());
    }

    public Long getId() {
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
