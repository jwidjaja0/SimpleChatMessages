package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class LoginSuccess implements Serializable, Login {
    private String clientID;

    public LoginSuccess(String clientID) {
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return "Login Success!";
    }
}
