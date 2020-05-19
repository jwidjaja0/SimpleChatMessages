package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class SignUpFail implements Serializable, Login {

    private int failCause;

    //Fail Cause:
    //0: no error
    //-1: username already exist

    public SignUpFail() {
        this(0);
    }

    public SignUpFail(int failCause) {
        this.failCause = failCause;
    }

    public int getFailCause() {
        return failCause;
    }

    public void setFailCause(int failCause) {
        this.failCause = failCause;
    }

}
