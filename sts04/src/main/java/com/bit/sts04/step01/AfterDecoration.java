package com.bit.sts04.step01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;

public class AfterDecoration implements AfterAdvice{
	
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("=======================");
	}
	
	public void afterThrowing(Exception ex) {
		System.out.println("/////////////////////");
	}

}
