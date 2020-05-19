package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class LoginSuccess implements Serializable, Login {
    @Override
    public String toString() {
        return "Login Success!";
    }
}
