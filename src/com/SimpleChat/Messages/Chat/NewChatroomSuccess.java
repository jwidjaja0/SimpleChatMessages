package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;
import com.SimpleChat.Messages.Interfaces.User;

import java.io.Serializable;
import java.util.List;

public class NewChatroomSuccess implements Serializable, Chat {
    private String roomID;
    private String name;
    private String password;

    public NewChatroomSuccess(String roomID, String name, String password) {
        this.roomID = roomID;
        this.name = name;
        this.password = password;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
