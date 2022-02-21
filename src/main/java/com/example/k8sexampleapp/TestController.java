package com.example.k8sexampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class TestController {
    @GetMapping("/foo")
    public String fooEndpoint() {
        return "some string";
    }
}
