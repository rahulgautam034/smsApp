package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

	Chat findByUserId(String userId);

}
