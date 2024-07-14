package com.example.springoauthsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected-resource")
public class ProtectedResourceController {

    @GetMapping
    public String getProtectedResource() {
        return "这是一个受保护的资源";
    }
}
