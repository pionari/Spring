package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		person w = factory.getBean("woman", person.class);
		person m = factory.getBean("man", person.class);
		
		System.out.println("여학생 입장");
		w.classWork();
		System.out.println("-------------");
		System.out.println("남학생 입장");
		m.classWork();
	}
}
