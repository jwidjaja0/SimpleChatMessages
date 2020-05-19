package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;

import java.io.Serializable;

public class LoginFail implements Serializable, Login {
    private int failCause;
    public final int WRONG_PASSWORD = -1;
    public final int INACTIVE_ACC = -2;

    /*fail causes:
    0: unknown

     */

    public LoginFail() {
        this(0);
    }

    public LoginFail(int failCause) {
        this.failCause = failCause;
    }

    public int getFailCause() {
        return failCause;
    }

    public void setFailCause(int failCause) {
        this.failCause = failCause;
    }

}
