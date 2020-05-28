package com.SimpleChat.Messages.Chat;

public class ChatroomDetail {
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
