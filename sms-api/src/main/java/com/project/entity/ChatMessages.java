package com.project.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "chat_messages")
@Getter
@Setter
@ToString
public class ChatMessages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "message_to")
	private String messageTo;
	@Column(name = "message_from")
	private String messageFrom;

	@CreationTimestamp
	@Column(name = "event_at", updatable = false)
	private Date eventAt;

	@UpdateTimestamp
	private Date updatedAt;

	private String message;

	@OneToOne(mappedBy = "chatMessages", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Chat chat;

}
