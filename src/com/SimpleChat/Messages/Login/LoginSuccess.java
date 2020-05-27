package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;
import com.SimpleChat.Messages.User.UserInfo;

import java.io.Serializable;

public class LoginSuccess implements Serializable, Login {
    private String clientID;
    private UserInfo userInfo;

    public LoginSuccess(String clientID) {
        this.clientID = clientID;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getClientID() {
        return clientID;
    }

    @Override
    public String toString() {
        return "Login Success!";
    }
}
