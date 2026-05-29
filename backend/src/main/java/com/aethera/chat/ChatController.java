package com.aethera.chat;

import com.aethera.common.dto.ChatRequest;
import com.aethera.common.response.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ApiResponse<String> chat(@Valid @RequestBody ChatRequest request) {

        String aiResponse = chatService.getAIResponse(request.getMessage());

        return new ApiResponse<>(true, "Success", aiResponse);
    }
}