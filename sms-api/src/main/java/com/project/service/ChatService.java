package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Chat;
import com.project.model.ChatModel;
import com.project.repository.ChatRepository;

@Service
public class ChatService {

	@Autowired
	ChatRepository chatRepository;

	/**
	 * 
	 * @param chatModal
	 * @return
	 */
	public Chat save(ChatModel chatModal) {
		Chat chat = new Chat();
		chat.setUserId(chatModal.getUserId());
		chat.setChatMessages(chatModal.getChatMessages());
		return chatRepository.save(chat);

	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public ChatModel getChat(String userId) {
		ChatModel chatModel = new ChatModel();
		Chat chat = chatRepository.findByUserId(userId);
		chatModel.setMessageList(chat.getMessageList());
		chatModel.setUserId(chat.getUserId());

		return chatModel;
	}

	/**
	 * 
	 * @return
	 */
	public List<Chat> getChatOfAllUser() {
		return chatRepository.findAll();
	}

}
