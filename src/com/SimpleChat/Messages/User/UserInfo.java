package com.SimpleChat.Messages.User;

import com.SimpleChat.Messages.Interfaces.User;

import java.io.Serializable;

public class UserInfo implements Serializable, User {
    private String nickname;

    public UserInfo() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
