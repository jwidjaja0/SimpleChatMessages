package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class NewChatroomSuccess implements Serializable, Chat {
    private String roomID;
    private String roomName;
    private String password;

    public NewChatroomSuccess(String roomID, String roomName, String password) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.password = password;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
