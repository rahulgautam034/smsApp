package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Chat;
import com.project.model.ChatModel;
import com.project.service.ChatService;

@RestController
@RequestMapping("api")
public class ChatController {

	@Autowired
	ChatService chatService;

	/**
	 * 
	 * @param chatModal
	 * @return
	 */
	@PostMapping("/save")
	public ResponseEntity<Chat> save(@RequestBody ChatModel chatModal) {
		try {
			Chat chat = chatService.save(chatModal);
			return new ResponseEntity<>(chat, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/user-chat")
	public ResponseEntity<?> getSingleUserChat(String userId) {
		try {
			ChatModel chatModal = chatService.getChat(userId);
			return new ResponseEntity<>(chatModal, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/all-user-chat")
	public ResponseEntity<?> getAllUserChat() {
		try {
			List<Chat> chat = chatService.getChatOfAllUser();
			return new ResponseEntity<>(chat, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
