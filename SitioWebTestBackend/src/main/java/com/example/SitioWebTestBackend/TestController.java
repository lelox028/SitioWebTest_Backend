package com.example.SitioWebTestBackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${DB_USERNAME}")
    private String dbUsername;

    @GetMapping("/test-env")
    public String testEnv() {
        return "DB Username: " + dbUsername;
    }
}
