package com.kt.ai.controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AiController {
	private final ChatModel chatModel;

	@GetMapping("/chat")
	public String chat(String prompt) {
		return chatModel.call(prompt);
	}
}
