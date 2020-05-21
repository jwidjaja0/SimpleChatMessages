package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class NewChatroomRequest implements Serializable, Chat {
    private String chatroomName;
    private String password;

    public NewChatroomRequest(String chatroomName, String password) {
        this.chatroomName = chatroomName;
        this.password = password;
    }

    public NewChatroomRequest(String chatroomName) {
        this.chatroomName = chatroomName;
        password = "";
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public String getPassword() {
        return password;
    }
}
