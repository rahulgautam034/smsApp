package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long> {

	Chat findByUserId(String userId);

}
