package com.blythe.aspect;
 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
 
	@Before("execution(* com.blythe.controller.HomeController.*(..))")
	public void logBefore() {
 
		System.out.println("logBefore() is running!");
		System.out.println("******");
	}
	
 	@Before("execution(* com.blythe.domain.Store.*(..))")
	public void logBeforeDomain() {
 
		System.out.println("logBeforeDomain() is running!");
		System.out.println("******");
	}
	
}
