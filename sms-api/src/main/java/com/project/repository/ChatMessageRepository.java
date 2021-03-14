package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.ChatMessages;

public interface ChatMessageRepository extends JpaRepository<ChatMessages, Long> {

}
