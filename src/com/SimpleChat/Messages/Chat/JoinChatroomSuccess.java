package com.SimpleChat.Messages.Chat;

import com.SimpleChat.Messages.Interfaces.Chat;
import com.SimpleChat.Messages.User.UserInfo;

import java.io.Serializable;
import java.util.List;

public class JoinChatroomSuccess implements Serializable, Chat {
    private ChatroomDetail chatroomDetail;
    private ChatMessageHistory chatMessageHistory;
    private List<UserInfo> userInfoList;

    public JoinChatroomSuccess(ChatroomDetail chatroomDetail, ChatMessageHistory chatMessageHistory, List<UserInfo> userInfoList) {
        this.chatroomDetail = chatroomDetail;
        this.chatMessageHistory = chatMessageHistory;
        this.userInfoList = userInfoList;
    }

    public ChatroomDetail getChatroomDetail() {
        return chatroomDetail;
    }

    public void setChatroomDetail(ChatroomDetail chatroomDetail) {
        this.chatroomDetail = chatroomDetail;
    }

    public ChatMessageHistory getChatMessageHistory() {
        return chatMessageHistory;
    }

    public void setChatMessageHistory(ChatMessageHistory chatMessageHistory) {
        this.chatMessageHistory = chatMessageHistory;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }
}
