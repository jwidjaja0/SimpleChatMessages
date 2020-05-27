package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;
import com.SimpleChat.Messages.User.UserInfo;

import java.io.Serializable;

public class ChatMessage implements Serializable, Chat {
    private String chatroomName;
    private String message;
    private Object attachment;
    private UserInfo userInfo;

    public ChatMessage(String chatroomName, String message, UserInfo userInfo) {
        this(chatroomName, message, null, userInfo);
    }

    public ChatMessage(String chatroomName, String message, Object attachment, UserInfo userInfo) {
        this.chatroomName = chatroomName;
        this.message = message;
        this.attachment = attachment;
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public String getChatroomName() {
        return chatroomName;
    }

    public String getMessage() {
        return message;
    }

    public Object getAttachment() {
        return attachment;
    }
}
