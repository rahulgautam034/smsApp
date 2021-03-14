package com.project.service;

import java.util.List;

import com.project.entity.Chat;
import com.project.model.ChatModel;

public interface ChatService {

	Chat save(ChatModel chatModal);

	ChatModel getChat(String userId);

	List<Chat> getChatOfAllUser();

}
