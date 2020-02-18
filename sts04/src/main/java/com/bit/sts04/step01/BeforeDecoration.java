package com.bit.sts04.step01;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeDecoration implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0);
		System.out.println(Arrays.toString(arg1));
		System.out.println(arg2);
	}
	
}
