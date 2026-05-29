package com.aethera.chat;

import com.aethera.ai.OllamaService;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final OllamaService ollamaService;

    public ChatService(OllamaService ollamaService) {
        this.ollamaService = ollamaService;
    }

    public String getAIResponse(String message) {

        String prompt = "You are a helpful AI assistant. Answer clearly and simply.\n\nUser: "
                + message + "\nAI:";

        return ollamaService.generateResponse(prompt);
    }
}