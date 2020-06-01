package com.SimpleChat.Messages.User;

import com.SimpleChat.Messages.Interfaces.User;

import java.io.Serializable;

public class UserInfo implements Serializable, User {
    private String nickname;
    private String clientID;

    public UserInfo() {
    }

    public UserInfo(String nickname, String clientID) {
        this.nickname = nickname;
        this.clientID = clientID;
    }

    @Override
    public String toString() {
        return
                "nickname='" + nickname + '\'' +
                ", clientID='" + clientID + '\'';
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
