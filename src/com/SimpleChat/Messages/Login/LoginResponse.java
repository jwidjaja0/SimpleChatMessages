package com.SimpleChat.Messages.Login;

import java.io.Serializable;

public class LoginResponse implements Serializable, Login {
    private boolean isSuccess;

    public LoginResponse(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
