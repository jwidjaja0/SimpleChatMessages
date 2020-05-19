package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class SignUpSuccess implements Serializable, Login {
    @Override
    public String toString() {
        return "Sign Up Success";
    }
}
