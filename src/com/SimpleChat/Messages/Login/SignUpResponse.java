package com.SimpleChat.Messages.Login;

import java.io.Serializable;

public class SignUpResponse implements Serializable, Login {
    private boolean isSuccess;

    public SignUpResponse(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
