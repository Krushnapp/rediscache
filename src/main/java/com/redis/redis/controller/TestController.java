package com.redis.redis.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("In/")
    public String sayHello() {
        return "hi bro how are you S  ";
    }

    @GetMapping("/method1")
    public Integer method1(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return  param1  + param2;
    }

    @GetMapping("/method2")
    public String method2(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return "Method 2 with param1: " + param1 + ", param2: " + param2;
    }

    @GetMapping("/method3")
    public String method3(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return "Method 3 with param1: " + param1 + ", param2: " + param2;
    }
}
