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
import com.project.service.ChatService;

import comm.project.modal.ChatModal;

@RestController
@RequestMapping("api")
public class ChatController {

	@Autowired
	ChatService chatService;

	@PostMapping("/save")
	public ResponseEntity<Chat> save(@RequestBody ChatModal chatModal) {
		try {
			Chat chat = chatService.save(chatModal);
			return new ResponseEntity<>(chat, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Chat>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/user-chat")
	public ResponseEntity<?> getSingleUserChat(String userId) {
		try {
			ChatModal chatModal = chatService.getChat(userId);
			return new ResponseEntity<>(chatModal, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

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
