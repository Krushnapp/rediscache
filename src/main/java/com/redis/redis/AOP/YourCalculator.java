package com.redis.redis.AOP;


import org.springframework.stereotype.Component;

@Component
public class YourCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
