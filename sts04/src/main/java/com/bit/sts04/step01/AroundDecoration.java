package com.bit.sts04.step01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundDecoration implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj=null;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		try {
			obj=invocation.proceed();
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		}catch (Exception e) {
			System.out.println("에러 처리");
		}
		return obj;
	}

}
