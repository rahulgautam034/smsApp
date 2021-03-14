package com.project.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChatModel {

	private String userId;
	private ChatMessagesModel chatMessages;
	private String to;
	private String from;
	private String message;
	private List<ChatMessagesModel> messageList = new ArrayList<>();
}
