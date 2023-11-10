package com.example.testservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    @SentinelResource(value = "/test", blockHandler = "testblock")
    public String test() {
        return "test";
    }


    public String testblock() {
        return "bolck";
    }
}
