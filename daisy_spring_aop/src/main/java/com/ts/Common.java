package com.ts;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {
/*
	@Before("execution(public void *Data())")
	public void sample1() {
		System.out.println("Welcome");
	}
*/	
//	@Before("execution(public void employeeData())")
//	public void sample2() {
//		System.out.println("Welcome");
//	}
	
/*	
	@After("execution(public void userData())")
	public void end() {
		System.out.println("End");		
	}
*/
	
	@Around("execution(public void userData())")
	public void test(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Welcome");
		pjp.proceed();
		System.out.println("End");		
	}
}
