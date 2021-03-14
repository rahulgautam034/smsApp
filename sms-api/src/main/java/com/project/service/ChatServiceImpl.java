package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Chat;
import com.project.model.ChatModel;
import com.project.repository.ChatRepository;

@Service
public class ChatServiceImpl implements ChatService {

	private ChatRepository chatRepository;

	public ChatServiceImpl(ChatRepository chatRepository) {
		this.chatRepository = chatRepository;
	}

	/**
	 * 
	 * @param chatModel
	 * @return
	 */
	@Override
	public Chat save(ChatModel chatModel) {
		Chat chat = new Chat();
		chat.setUserId(chatModel.getUserId());
//		chat.setChatMessages(chatModel.getChatMessages());
		return chatRepository.save(chat);

	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	@Override
	public ChatModel getChat(String userId) {
		ChatModel chatModel = new ChatModel();
		Chat chat = chatRepository.findByUserId(userId);
//		chatModel.setMessageList(chat.getMessageList());
		chatModel.setUserId(chat.getUserId());

		return chatModel;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public List<Chat> getChatOfAllUser() {
		return chatRepository.findAll();
	}

}
