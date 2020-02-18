package com.bit.sts04.step01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterSuccessDecoration implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] arg, Object target) throws Throwable {
		System.out.println(returnValue);
		System.out.println("=======================");
	}

}
