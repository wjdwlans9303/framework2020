package com.bit.SpringJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.service.*;

public class SpringJava {

	public static void main(String[] args) {

		org.springframework.context.ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Remote3 obj=(Remote3)ac.getBean("remote");
		obj.func1();
//		Remote2 obj=(Remote2)ac.getBean("remote");
//		obj.func1();
//		Remote obj=(Remote)ac.getBean("remote");
//		obj.func3();
	}

}
