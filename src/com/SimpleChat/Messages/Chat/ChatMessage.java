package com.SimpleChat.Messages.Chat;

import java.io.Serializable;

public class ChatMessage implements Serializable {
    private String chatroomName;
    private String message;
    private Object attachment;

    public ChatMessage(String chatroomName, String message) {
        this.chatroomName = chatroomName;
        this.message = message;
        attachment = null;
    }

    public ChatMessage(String chatroomName, String message, Object attachment) {
        this.chatroomName = chatroomName;
        this.message = message;
        this.attachment = attachment;
    }

    public String getMessage() {
        return message;
    }

    public Object getAttachment() {
        return attachment;
    }
}