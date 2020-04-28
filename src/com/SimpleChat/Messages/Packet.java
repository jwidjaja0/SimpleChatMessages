package com.SimpleChat.Messages;

import java.io.Serializable;

public class Packet implements Serializable {
    private String messageType;
    private String userID;
    private Serializable message;

    public Packet(String messageType, String userID, Serializable message) {
        this.messageType = messageType;
        this.userID = userID;
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getUserID() {
        return userID;
    }

    public Serializable getMessage() {
        return message;
    }
}
