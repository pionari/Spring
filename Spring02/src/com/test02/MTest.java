package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address jinhee = (Address) factory.getBean("jinhee");
		Address la = (Address) factory.getBean("la");
		
		System.out.println(jinhee);
		System.out.println(la);
	}
	
	

}
