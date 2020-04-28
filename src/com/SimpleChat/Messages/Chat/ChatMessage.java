package com.SimpleChat.Messages.Chat;

import java.io.Serializable;

public class ChatMessage implements Serializable {

    private String message;
    private Object attachment;

    public ChatMessage(String message) {
        this.message = message;
        attachment = null;
    }

    public ChatMessage(String message, Object attachment) {
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
