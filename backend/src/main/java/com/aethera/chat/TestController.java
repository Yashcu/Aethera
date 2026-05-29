package com.aethera.chat;

import com.aethera.common.dto.TestRequest;
import com.aethera.common.response.ApiResponse;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @PostMapping
    public ApiResponse<String> test(@Valid @RequestBody TestRequest request) {
        log.info("Request received: {}", request.getMessage());
        return new ApiResponse<>(true, "Success", request.getMessage());
    }
}
