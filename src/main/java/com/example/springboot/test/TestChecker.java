package com.example.springboot.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestChecker {

    @RequestMapping("Hello")
    public String test() {
        return "Hello Word";
    }

}
