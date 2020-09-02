package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		messageBean apple = (messageBean) factory.getBean("apple");
		apple.sayHello();
		
		messageBean watermelon = (messageBean) factory.getBean("watermelon");
		watermelon.sayHello();
		
		messageBean melon = (messageBean) factory.getBean("melon");
		melon.sayHello();
		
	}

}
