package comm.project.modal;

import java.util.ArrayList;
import java.util.List;

import com.project.entity.ChatMessages;

public class ChatModal {

	private String userId;

	private ChatMessages chatMessages;

	private String to;

	private String from;

	private String message;

	public ChatMessages getChatMessages() {
		return chatMessages;
	}

	public void setChatMessages(ChatMessages chatMessages) {
		this.chatMessages = chatMessages;
	}

	private List<ChatMessages> messageList = new ArrayList<ChatMessages>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<ChatMessages> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<ChatMessages> messageList) {
		this.messageList = messageList;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
