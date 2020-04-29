package com.SimpleChat.Messages.Login;

import java.io.Serializable;

public class SignUpRequest implements Serializable, Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public SignUpRequest(String username, String password, String firstName, String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
