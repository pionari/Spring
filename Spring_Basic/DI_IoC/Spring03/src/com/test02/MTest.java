package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp park = (Emp) factory.getBean("park");
		Emp la = factory.getBean("la", Emp.class);
		
		System.out.println(park);
		System.out.println(la);
	}

}
