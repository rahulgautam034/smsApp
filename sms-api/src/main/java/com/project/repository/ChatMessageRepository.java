package com.project.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.project.entity.ChatMessages;
import com.project.model.ChatMessagesModel;

@Repository
@Transactional
public interface ChatMessageRepository extends JpaRepository<ChatMessages, Long> {

	default ChatMessages modelToEntity(Gson gson, ChatMessagesModel chatMessagesModel) {
		try {
			String jsonData = gson.toJson(chatMessagesModel);
			return gson.fromJson(jsonData, ChatMessages.class);
		} catch (Exception e) {
			return null;
		}
	}

}
