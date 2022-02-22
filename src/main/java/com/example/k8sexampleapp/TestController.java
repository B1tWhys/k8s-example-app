package com.example.k8sexampleapp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
@AllArgsConstructor
public class TestController {
    TestControllerConfig config;
    
    
    @GetMapping("/foo")
    public String fooEndpoint() {
        return config.getResponseMesg();
    }
}
