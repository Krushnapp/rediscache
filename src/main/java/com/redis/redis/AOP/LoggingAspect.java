package com.redis.redis.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.redis.redis.controller.TestController.method1(int, int)) || " +
            "execution(* com.redis.redis.controller.TestController.method2(int, int)) || " +
            "execution(* com.redis.redis.controller.TestController.method3(int, int))")
    public void selectedMethods() {}

    @Before("selectedMethods()")
    public void beforeSelectedMethods(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Executing method: " + methodName + " with args: " + Arrays.toString(args));
    }
}

