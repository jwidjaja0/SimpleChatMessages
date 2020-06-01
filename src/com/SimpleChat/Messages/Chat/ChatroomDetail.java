package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class ChatroomDetail implements Serializable, Chat {
    private String chatroomName;
    private String roomID;

    public ChatroomDetail(String chatroomName, String roomID) {
        this.chatroomName = chatroomName;
        this.roomID = roomID;
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public String getRoomID() {
        return roomID;
    }

}
