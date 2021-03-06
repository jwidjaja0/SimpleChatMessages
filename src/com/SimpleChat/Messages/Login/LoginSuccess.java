package com.SimpleChat.Messages.Login;

import com.SimpleChat.Messages.Interfaces.Login;
import com.SimpleChat.Messages.User.UserInfo;

import java.io.Serializable;

public class LoginSuccess implements Serializable, Login {

    private UserInfo userInfo;

    public LoginSuccess(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "Login Success!";
    }
}
