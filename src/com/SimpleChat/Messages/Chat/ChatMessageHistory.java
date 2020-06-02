package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChatMessageHistory implements Serializable, Chat {
    private List<ChatMessage> chatMessageList;

    public ChatMessageHistory() {
        chatMessageList = new ArrayList<>();
    }

    public ChatMessageHistory(List<ChatMessage> chatMessageList) {
        this.chatMessageList = chatMessageList;
    }

    public List<ChatMessage> getChatMessageList() {
        return chatMessageList;
    }

    public void setChatMessageList(List<ChatMessage> chatMessageList) {
        this.chatMessageList = chatMessageList;
    }
}
