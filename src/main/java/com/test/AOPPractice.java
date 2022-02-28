package com.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AOPPractice {
    @Before("execution(* com.test.TestController.*(..))")
    private void callOnTest(JoinPoint joinPoint) {
        if (joinPoint.getArgs().length > 0)
            System.out.println(joinPoint.getArgs()[0]);
        System.out.println("aop called");
    }

    @After("execution(* com.test.TestController.*())")
    private void callAfterTest() {
        System.out.println("aop After called");
    }
}
