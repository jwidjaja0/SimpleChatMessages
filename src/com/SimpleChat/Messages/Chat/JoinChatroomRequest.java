package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;
import com.SimpleChat.Messages.User.UserInfo;

import java.io.Serializable;

public class JoinChatroomRequest implements Serializable, Chat {
    private String chatroomName;
    private String password;
    private UserInfo userInfo;

    public JoinChatroomRequest(String chatroomName, String password, UserInfo userInfo) {
        this.chatroomName = chatroomName;
        this.password = password;
        this.userInfo = userInfo;
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public String getPassword() {
        return password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
}
