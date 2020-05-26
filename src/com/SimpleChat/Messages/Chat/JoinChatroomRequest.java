package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class JoinChatroomRequest implements Serializable, Chat {
    private String chatroomName;
    private String password;

    public JoinChatroomRequest(String chatroomName, String password) {
        this.chatroomName = chatroomName;
        this.password = password;
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public String getPassword() {
        return password;
    }


}
