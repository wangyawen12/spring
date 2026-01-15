package org.example.demospring2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* org.example.demospring2.proxy..*.*(..))")
    public void before() {
        System.out.println("this is an advice");
    }
}
