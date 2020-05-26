package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;

public class LeaveRoomRequest implements Serializable, Chat {
    private String roomName;

    public LeaveRoomRequest(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
