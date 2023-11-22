package com.redis.redis.controller;



import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("In/")
    public String sayHello() {
        return "hi bro how are you S  ";
    }
    @GetMapping("Out/")
    public String sayHello() {
        return "hi bro how are you S ok  ";
    }

    @GetMapping("lost/")
    public String sayHello() {
        return "Nothing" +
                "  ";
    }
}
