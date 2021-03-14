package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Chat;
import com.project.repository.ChatRepository;

import comm.project.modal.ChatModal;

@Service
public class ChatService {

	@Autowired
	ChatRepository chatRepository;

	public Chat save(ChatModal chatModal) {
		Chat chat = new Chat();
		chat.setUserId(chatModal.getUserId());
		chat.setChatMessages(chatModal.getChatMessages());
		Chat ch = chatRepository.save(chat);
		return ch;

	}

	public ChatModal getChat(String userId) {
		ChatModal chatModal = new ChatModal();
		Chat chat = chatRepository.findByUserId(userId);
		chatModal.setMessageList(chat.getMessageList());
		chatModal.setUserId(chat.getUserId());

		return chatModal;
	}

	public List<Chat> getChatOfAllUser() {
		List<Chat> chat = chatRepository.findAll();
		return chat;
	}

}
