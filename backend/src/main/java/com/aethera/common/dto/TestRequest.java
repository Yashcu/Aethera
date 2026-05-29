package com.aethera.common.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TestRequest {

    @NotBlank(message = "Message cannot be empty")
    private String message;
}
