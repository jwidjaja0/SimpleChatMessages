package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;
import com.SimpleChat.Messages.Interfaces.User;

import java.io.Serializable;
import java.util.List;

public class NewChatroomSuccess implements Serializable, Chat {
    //TODO:Fill with appropriate fields
    private ChatroomDetail chatroomDetail;
    private List<ChatMessage> chatMessageList;
    private List<User> userList;

    public ChatroomDetail getChatroomDetail() {
        return chatroomDetail;
    }

    public void setChatroomDetail(ChatroomDetail chatroomDetail) {
        this.chatroomDetail = chatroomDetail;
    }

    public List<ChatMessage> getChatMessageList() {
        return chatMessageList;
    }

    public void setChatMessageList(List<ChatMessage> chatMessageList) {
        this.chatMessageList = chatMessageList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
