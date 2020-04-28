package com.SimpleChat.Messages.Login;

public class SignUpResponse {
    private boolean isSuccess;

    public SignUpResponse(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
