package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		System.out.println("Spring Bean Container 생성!");
		
		TV ig = factory.getBean("IG", IgTV.class);
//		TV ss = factory.getBean("SS", SSTV.class);
		
		ig.powerOn();
//		ss.powerOn();
		
	}

}
