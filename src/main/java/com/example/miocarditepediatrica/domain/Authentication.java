package com.example.miocarditepediatrica.domain;

import org.springframework.data.mongodb.core.index.Indexed;

public class Authentication {
    @Indexed(unique = true)
    private String login;
    private String password;
    private String personId;
    private String personRole;

    public Authentication(String login, String password, String personId, String personRole) {
        this.login = login;
        this.password = password;
        this.personId = personId;
        this.personRole = personRole;
    }

    public Boolean verifyLogin(String login, String password){
        return this.login.equals(login) && this.password.equals(password);
    }

}