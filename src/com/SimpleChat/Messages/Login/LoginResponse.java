package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class LoginResponse implements Serializable, Login {
    private boolean isSuccess;
    private boolean isWrongPassword;

    public LoginResponse(boolean isSuccess) {
        this(isSuccess, false);
    }

    public LoginResponse(boolean isSuccess, boolean isWrongPassword){
        this.isSuccess = isSuccess;
        this.isWrongPassword = isWrongPassword;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public boolean isWrongPassword() {
        return isWrongPassword;
    }
}
