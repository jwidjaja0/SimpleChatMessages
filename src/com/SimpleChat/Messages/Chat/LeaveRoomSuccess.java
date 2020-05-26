package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class LeaveRoomSuccess implements Serializable, Chat {
    private String roomName;

    public LeaveRoomSuccess(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
