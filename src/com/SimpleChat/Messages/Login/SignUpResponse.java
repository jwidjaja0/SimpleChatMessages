package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class SignUpResponse implements Serializable, Login {
    private boolean isSuccess;
    private int failCause;

    //Fail Cause:
    //0: no error
    //-1: username already exist

    public SignUpResponse(boolean isSuccess) {
        this.isSuccess = isSuccess;
        failCause = 0;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getFailCause() {
        return failCause;
    }

    public void setFailCause(int failCause) {
        this.failCause = failCause;
    }

}
