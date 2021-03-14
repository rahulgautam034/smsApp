package com.project.model;

import com.project.entity.Chat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatMessagesModel {

	private String messageTo;
	private String messageFrom;
	private String message;
	private Chat chat;

}