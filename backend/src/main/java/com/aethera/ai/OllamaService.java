package com.aethera.ai;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OllamaService {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String OLLAMA_URL = "http://localhost:11434/api/generate";

    public String generateResponse(String prompt) {

        Map<String, Object> request = Map.of(
                "model", "qwen3:4b",
                "prompt", prompt,
                "stream", false);

        Map response = restTemplate.postForObject(OLLAMA_URL, request, Map.class);

        return response.get("response").toString();
    }
}