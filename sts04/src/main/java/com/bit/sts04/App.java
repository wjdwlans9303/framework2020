package com.bit.sts04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.sts04.module.Module01;

public class App {
    public static void main( String[] args ){
        ApplicationContext context=null;
        context=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Module01 modul01=(Module01) context.getBean("custom");
        
        modul01.func01();
        modul01.func02("java");
        modul01.func03();
        modul01.function04();
        modul01.print01();
    }
}